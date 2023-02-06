package trainingPr;

import java.util.Scanner;

public class _2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter String");
		String s1 = sc.nextLine();
		String[] arr = s1.split(" ");

		System.out.println("Enter replace word");
		String replace = sc.next();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(replace)) {
				System.out.println("enter new word");
				arr[i] = sc.next();

			}

		}
		String newString = " ";
		for (String a1 : arr) {
			newString += a1 + " ";
		}

		System.out.println(newString);

	}
}

//
//String s = " My name is XYZ";
//String[] s1 = s.split(" ");
//
//int a = s1.length - 1;
//s1[a] = "Ram";
//
//for (int j = 0; j < s1.length; j++) {
//	System.out.print(s1[j] + " ");