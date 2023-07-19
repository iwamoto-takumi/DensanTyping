package site.iwataku;

public class Discriminate {

	public static String user(String str) {
		if(str.equals("Visitor"))	return "来訪者";
		else if(str.equals("CollegeStudent"))	return "高専生";
		else if(str.equals("Teacher"))	return "先生";
		else if(str.equals("来訪者"))	return "Visitor";
		else if(str.equals("高専生"))	return "CollegeStudent";
		else if(str.equals("先生"))	return "Teacher";
		else {
			System.out.println(str);
			throw new NullPointerException();
		}
	}

	public static String mode(String str) {
		if(str.equals("Japanese"))	return "日本語";
		else if(str.equals("Hiragana"))	return "にほんご";
		else if(str.equals("日本語"))	return "Japanese";
		else if(str.equals("にほんご"))	return "Hiragana";
		else {
			System.out.println(str);
			throw new NullPointerException();
		}
	}

}
