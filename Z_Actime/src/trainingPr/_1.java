package trainingPr;

import java.util.Scanner;

public class _1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int max = 0;
		String[] a = new String[size];
		String name = " ";

		for (int i = 0; i < a.length; i++) {
			System.out.println(" Enter the Words");
			a[i] = sc.next();
		}

		for (int j = 0; j < a.length; j++) {
			char[] ch = a[j].toCharArray();
			if (max <= ch.length) {
				max = ch.length;
				name = a[j];
			}
		}

		System.out.println(max);
		System.out.println(name);
	}

}
