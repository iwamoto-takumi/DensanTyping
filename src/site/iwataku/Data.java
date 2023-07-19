package site.iwataku;

import java.util.HashMap;
import java.util.Map;

public class Data {

	private static String version = "Alpha-0.0.2";
	private static String trueConfigVersion = version;
	public String getVersion() { return version; }
	public static String getTrueConfigVersion() { return trueConfigVersion; }

	private static String resourceFolderName = "resource";
	private static String recordFileName = "記録.txt";
	private static String configFileName = "設定.config";
	public static String getResourceFolderName() { return resourceFolderName; }
	public static String getRecordFileName() { return recordFileName; }
	public static String getConfigFileName() { return configFileName; }
	private static String config1 = "EnableRecord";
	private static String config2 = "MaxRecordValue";
	private static String config3 = "EnableDebugMode";
	private static String config4 = "ConfigVersion";
	public static String getConfig1() { return config1; }
	public static String getConfig2() { return config2; }
	public static String getConfig3() { return config3; }
	public static String getConfig4() { return config4; }
	private static boolean EnableRecord = true, EnableDebugMode = false;
	private static int MaxRecordValue = 100;
	private static String ConfigVersion;
	public static void setEnableRecord(boolean b) { EnableRecord = b; }
	public static void setMaxRecordValue(int i) { MaxRecordValue = i; }
	public static void setEnableDebugMode(boolean b) { EnableDebugMode = b; }
	public static void setConfigVersion(String str) {
		if(!(getTrueConfigVersion().equalsIgnoreCase(str))) {
			System.out.println("Don't match ConfigVersion.");
			System.out.println("Please Fix ConfigVersion. (" + getResourceFolderName() + "\\" + getConfigFileName() + ")");
			Event.exit(201);
		}
		ConfigVersion = str;
	}
	public static boolean getEnableRecord() { return EnableRecord; }
	public static int getMaxRecordValue() { return MaxRecordValue; }
	public static boolean getEnableDebugMode() { return EnableDebugMode; }
	public String getConfigVersion() { return ConfigVersion; }

	private static int NowRecordValue;
	public static int getNowRecordValue() { return NowRecordValue; }
	public static void setNowRecordValue(int i) { NowRecordValue = i; }

	private boolean outKeyCode = false;
	public void setEnableOutKeyCode(boolean b) { outKeyCode = b; }
	public boolean getEnableOutKeyCode() { return outKeyCode; }
	private String question = "";
	public void setQuestion(String str) { question = str; }
	public String getQuestion() { return question; }
	private static String mode = "Japanese";
	private static String user = "Visitor";
	public static void setMode(String str) { mode = str; }
	public static void setUser(String str) { user = str; }
	public static String getMode() { return mode; }
	public static String getUser() { return user; }

	private static Map<String, String> Lesson1 = new HashMap<>();
	private static Map<String, String> Lesson2 = new HashMap<>();
	private static Map<String, String> Lesson3 = new HashMap<>();
	private static Map<String, String> Lesson4 = new HashMap<>();
	private static Map<String, String> Lesson5 = new HashMap<>();
	private static Map<String, String> Begineer = new HashMap<>();
	private static Map<String, String> Intermediate = new HashMap<>();
	private static Map<String, String> Advanced = new HashMap<>();
	private static Map<String, String> Master = new HashMap<>();
	private static Map<String, String> Expart = new HashMap<>();
	public void setHashMap(String str, HashMap<String, String> Map) {
		switch(str) {
	 		case "Lesson1": Lesson1 = Map;
	 		case "Lesson2": Lesson2 = Map;
	 		case "Lesson3": Lesson3 = Map;
	 		case "Lesson4": Lesson4 = Map;
	 		case "Lesson5": Lesson5 = Map;
	 		case "Begineer": Begineer = Map;
	 		case "Intermediate": Intermediate = Map;
	 		case "Advanced": Advanced = Map;
	 		case "Master": Master = Map;
	 		case "Expart": Expart = Map;
		}
	}

	public static void setHashMap(String str, String key, String value) {
		switch(str) {
			case "Lesson1": Lesson1.put(key, value); break;
			case "Lesson2": Lesson2.put(key, value); break;
			case "Lesson3": Lesson3.put(key, value); break;
			case "Lesson4": Lesson4.put(key, value); break;
			case "Lesson5": Lesson5.put(key, value); break;
			case "Begineer": Begineer.put(key, value); break;
			case "Intermediate": Intermediate.put(key, value); break;
			case "Advanced": Advanced.put(key, value); break;
	 		case "Master": Master.put(key, value); break;
	 		case "Expart": Expart.put(key, value); break;
		}
	}
	public static Map<String, String> getHashMap(String str) {
		switch(str) {
			case "Lesson1": return Lesson1;
			case "Lesson2": return Lesson2;
			case "Lesson3": return Lesson3;
			case "Lesson4": return Lesson4;
			case "Lesson5": return Lesson5;
			case "Begineer": return Begineer;
			case "Intermediate": return Intermediate;
			case "Advanced": return Advanced;
			case "Master": return Master;
			case "Expart": return Expart;
		}
		return null;
	}

	private static boolean startGame = false;
	public static void setStartGame(boolean b) { startGame = b; }
	public static boolean getStartGame() { return startGame; }

}
