package trainingPr;

import java.util.Scanner;

public class _2dString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row size");
		int row = sc.nextInt();
		System.out.println("Enter colomn size");
		int col = sc.nextInt();

		String[][] s = new String[row][col];

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				s[i][j] = sc.next();
			}
		}

		for (int f = 0; f < s.length; f++) {
			for (int j = 0; j < s[f].length; j++) {
				System.out.print(s[f][j] + " ");
			}
			System.out.println();
		}
	}
}

//next= for sigle word ex: Ram
//nextline= for sentence ex: Rama is my name