package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		boolean flag = false;
		if (text1.length() == text2.length()) {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			for (int i = 0; i < charArray1.length; i++) {
				if (charArray1[i] == charArray2[i]) {
					flag = true;
				}

			}
		}
		if (flag == true)
			System.out.println("Anagram");
		else
			System.out.println("Not anagram");
	}

}
