package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8, firstNum = 0, secNum = 1, sum = 0; //initialize variables
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 2; i < range; i++) { //since first 2 values are already displayed, starting loop with i=2
			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;

		}

	}

}
