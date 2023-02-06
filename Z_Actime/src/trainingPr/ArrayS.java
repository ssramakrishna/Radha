package trainingPr;

import java.util.Scanner;

public class ArrayS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int sum = 0;
		int[] a = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("enter value");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println(sum);
	}
}
