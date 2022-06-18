package week2.day1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";

		String[] split = test.split(" ");
		for (int i = 0; i < split.length; i++) {

			if (i % 2 != 0) {
				String rev = "";
				char[] words = split[i].toCharArray();
				for (int j = words.length - 1; j >= 0; j--)
					// System.out.println(words[j]);
					rev += words[j];
				System.out.print(rev);

			}

			else
				System.out.print(split[i]);
			System.out.print(" ");

		}

	}
}
