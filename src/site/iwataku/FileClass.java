package site.iwataku;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileClass{

	static String resourceFolderName = Data.getResourceFolderName();
	static String recordFileName = Data.getRecordFileName();
	static String configFileName = Data.getConfigFileName();
	static File resourceFolder = new File(resourceFolderName);
	static File recordFile = new File(resourceFolderName + "\\" + recordFileName);
	static File configFile = new File(resourceFolderName + "\\" + configFileName);

	public static void initialize() throws FileNotFoundException{


		if(!(resourceFolder.exists())) {
			resourceFolder.mkdir();
		}

		if(!(recordFile.exists())) {
			try {
				recordFile.createNewFile();
			} catch (IOException e) { }
		}

		if(!(configFile.exists())) {
			try(var bw = new BufferedWriter(new FileWriter(configFile));) {
				configFile.createNewFile();
				bw.write("# Typing Soft for DensanのConfigファイルです\n\n");
				bw.write("##################\n");
				bw.write("# ユーザー用設定 #\n");
				bw.write("##################\n\n");
				bw.write("# 記録を保存するか (true / false) Default: true\n");
				bw.write(Data.getConfig1() + ": truen\n");
				bw.write("# 最大記憶記録数 (1 ～ 1000) Default: 100\n");
				bw.write(Data.getConfig2() + ": 100\n\n\n");
				bw.write("################\n");
				bw.write("# 開発者用設定 #\n");
				bw.write("################\n\n");
				bw.write("# デバックモードを有効にするか(true / false) Default: false\n");
				bw.write(Data.getConfig3() + ": false\n\n");
				bw.write("# 以下の情報は書き換えないでください\n");
				bw.write(Data.getConfig4() + ": " + Data.getTrueConfigVersion() + "\n");
			} catch(IOException e) { }
		}

		try(var br = new BufferedReader(new FileReader(configFile));) {
			var str = br.readLine();
			while(str != null) {
				if(!(str == "")) {
					try{
						if(!(str.charAt(0) == '#')) {
							if(str.contains(Data.getConfig1())) {
								if(str.contains("true"))	Data.setEnableRecord(true);
								else if(str.contains("false"))	Data.setEnableRecord(false);
								else System.out.println("Can't found \"EnableRecord\" in " + resourceFolderName + "\\ + config_fn");
							} else if(str.contains(Data.getConfig2())) {
								Data.setMaxRecordValue(Integer.parseInt(str.substring(16, str.length())));
							} else if(str.contains(Data.getConfig3())) {
								if(str.contains("true"))	Data.setEnableDebugMode(true);
								else if(str.contains("false"))	Data.setEnableDebugMode(false);
								else System.out.println("Can't found \"EnableDebugMode\" in " + resourceFolderName + "\\ + config_fn");
							} else if(str.contains(Data.getConfig4())) {
								Data.setConfigVersion(str.substring(15, str.length()));
							}
						}
					} catch(StringIndexOutOfBoundsException e) { }
				}
				str = br.readLine();
			}
		} catch (IOException e) { }

		try(var br = new BufferedReader(new FileReader(recordFile));) {
			var line = br.readLine();
			String array[] = new String[Data.getMaxRecordValue()];

			var i = 0;
			for(; line != null; i++) {
				array[i] = line;
				line = br.readLine();
			}

			Data.setNowRecordValue(i);

		} catch (IOException e) {

		}
	}

	public static void record(String user, String type, double score) {
		try(var pw = new PrintWriter(new BufferedWriter(new FileWriter(recordFile, true)))) {
			if(Data.getNowRecordValue() < Data.getMaxRecordValue()) {
				pw.println("[" + user + "] [" + type + "] " + String.format("%.0f", score) + "点");
			} else {
				try(var br = new BufferedReader(new FileReader(recordFile));) {
					var line = br.readLine();
					String array[] = new String[Data.getMaxRecordValue()];

					int i = 0;
					for(;line != null; i++) {
						array[i] = line;
						line = br.readLine();
					}
					try(var bw = new BufferedWriter(new FileWriter(recordFile));) {
						i = 0;
						for(var str : array) {
							if(str != null && i != 0) {
								bw.write(str);
							}
						}
					}

				} catch (IOException e) {

				}
				pw.println("[" + user + "] [" + type + "] " + String.format("%.0f", score) + "点");
			}
		} catch (IOException e) { }
	}

	public static int[] getRecord() {
		int[] record = new int[Data.getMaxRecordValue()];
		int[] result = new int[3];
		int i = 0;
		try(var br = new BufferedReader(new FileReader(recordFile));) {
			String line = br.readLine();
			for(; line != null; i++) {
				line = line.replaceAll("[A-Za-z!#\\$%&'\\[\\]\\(\\)=~\\|\\-\\^`\\{\\}\\*\\+<>\\?_@;,\\.\\/'点, ]", "");
				line = line.substring(1, line.length());
				if(!line.equals(""))	record[i] = Integer.parseInt(line);
				line = br.readLine();
			}
		} catch (IOException e) { }
		for(int j = 0; j < i; j++) {
			for(int k = 0; k < 3; k++) {
				if(Integer.max(result[k], record[j]) == record[j]) {
					result[k] = Integer.max(result[k], record[j]);
					break;
				}
			}
		}
		return result;
	}

	public static void clearRecord() {
		recordFile.delete();
		try {
			recordFile.createNewFile();
		} catch (IOException e) { }
		int[] array = FileClass.getRecord();
		Main.control.textField_1th.setText(array[0] + " 点");
		Main.control.textField_2th.setText(array[1] + " 点");
		Main.control.textField_3th.setText(array[2] + " 点");
	}

	public static void config() {
		try(var bw = new BufferedWriter(new FileWriter(configFile));) {
			bw.write("# Typing Soft for DensanのConfigファイルです\n\n");
			bw.write("##################\n");
			bw.write("# ユーザー用設定 #\n");
			bw.write("##################\n\n");
			bw.write("# 記録を保存するか (true / false) Default: true\n");
			bw.write(Data.getConfig1() + ": " + Data.getEnableRecord() + "\n\n");
			bw.write("# 最大記憶記録数 (1 ～ 1000) Default: 100\n");
			bw.write(Data.getConfig2() + ": " + Data.getMaxRecordValue() + "\n\n\n");
			bw.write("################\n");
			bw.write("# 開発者用設定 #\n");
			bw.write("################\n\n");
			bw.write("# デバックモードを有効にするか(true / false) Default: false\n");
			bw.write(Data.getConfig3() + ": " + Data.getEnableDebugMode() + "\n\n");
			bw.write("# 以下の情報は書き換えないでください\n");
			bw.write(Data.getConfig4() + ": " + Data.getTrueConfigVersion() + "\n");
		} catch(IOException e) { }
	}

}
