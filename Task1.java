
//Ahmed Gamal Sec 1 Bn 3
// Problem 1

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of 1st arry:\n");
		int lengthA = input.nextInt();
		int[] a = new int[lengthA];
		for (int i = 0; i < lengthA; i++) {
			System.out.print("Please Enter the next number in the arry: \n");
			a[i] = input.nextInt();
		}
		System.out.print("\n Enter the length of 2nd arry:\n");
		int lengthB = input.nextInt();
		int[] b = new int[lengthB];
		for (int i = 0; i < lengthB; i++) {
			System.out.print("Please Enter the next number in the arry: \n");
			b[i] = input.nextInt();
		}
		int lengthC = lengthA + lengthB;
		int[] c = new int[lengthC];
		int ia = 0, ib = 0, ic = 0;
		while (ia < lengthA && ib < lengthB) {
			if (a[ia] < b[ib]) {
				c[ic] = a[ia];
				ia++;

			} else {
				c[ic] = b[ib];
				ib++;

			}
			ic++;

		}
		while (ic < lengthC) {
			if (ia < lengthA) {
				c[ic] = a[ia];
				ia++;
			} else {
				if (ib < lengthB) {
					c[ic] = b[ib];
					ib++;

				}
			}
			ic++;
		}

		for (int i = 0; i < lengthC; i++) {
			System.out.print(" " + c[i]);
		}

	}
}