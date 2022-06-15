package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		int size=arr.length;
		Arrays.sort(arr);
		System.out.println("Sorted array is");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		for (int i=0; i<size; i++)
		{
			if (arr[i]!=i+1)
			{
				System.out.println("Missing element is " +(i+1));
				break;
			}
		}

	}

}
