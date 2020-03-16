//Ahmed Gamal Sec 1 Bn 3
// Problem 2

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the size of arry:");
		int length = input.nextInt();
		int[] nums = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("Please Enter the next number in the arry: \n");
			nums[i] = input.nextInt();
		}
		System.out.print("Please Enter the Required Sum: \n");
		int sum = input.nextInt();

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (nums[j] == sum - nums[i]) {
					System.out.print("The two indexes  are " + i + " , " + j);
					System.exit(0);
				}
			}
		}
		System.out.print("Requird not found");

	}
}
