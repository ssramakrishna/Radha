package trainingPr;

import java.util.Scanner;

public class Raghu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();

		int count = 0;

		String[] a = new String[size];

		for (int i = 0; i < a.length; i++) {
			System.out.println(" Enter the Words");
			a[i] = sc.next();
		}

		for (int j = 0; j < a.length; j++) {
			if (a[j].contains("A") || a[j].contains("a")) {
				count++;
			}

		}
		System.out.println(count);
	}
}
