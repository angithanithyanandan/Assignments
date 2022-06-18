package week2.day1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		String s = "madam";
		String rev = "";
		char[] charArray = s.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			rev += charArray[i];

		}
		if (rev.equals(s)) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not palindrome");

	}

}
