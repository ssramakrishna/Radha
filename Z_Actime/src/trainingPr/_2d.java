package trainingPr;

import java.util.Scanner;

public class _2d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter row");
		int row = sc.nextInt();

		System.out.println("Enter Column");
		int col = sc.nextInt();
		System.out.println("Enter Values");

		int arr[][] = new int[row][col];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int j = 0; j < arr.length; j++) {
			for (int k = 0; k < arr[j].length; k++) {
				System.out.print(arr[j][k] + " ");
			}
			System.out.println(" ");

		}
	}
}

//
//
//
//int arr[][]= new int[3][4];
//
//for (int i = 0; i < arr.length; i++) 
//{
//	for (int j = 0; j < arr[i].length; j++) 
//	{
//		arr[i][j]=sc.nextInt();
//	}
//}
//for (int j = 0; j < arr.length; j++) 
//{
//	for (int k = 0; k < arr[j].length; k++) 
//	{
//		System.out.print(arr[j][k]+ " ");
//	}
//	System.out.println(" ");
//	
//}
