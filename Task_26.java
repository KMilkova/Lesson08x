package It.lhu.unit08.main;

import java.util.Scanner;

//26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:
//а) вычислить сумму отрицательных элементов в каждой строке;
//б) определить максимальный элемент в каждой строке;
//в) переставить местами максимальный и минимальный элементы матрицы.

public class Task_26 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите размерность");
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] mas = new int[n][m];
		System.out.println("Введите элементы");
		for (int i = 0; i<mas.length;i++) {
			for (int j = 0; j<mas[i].length;j++) {
				mas[i][j] = in.nextInt();
			}
		}		
		printMatrix(mas);		
		printSum(findSumOtrElInEveryRow(mas));
		printMax(findMaxInEveryRow(mas));	
		System.out.println();
		change(mas);
		printMatrix(mas);
		
	}
	
	public static void change(int[][] mas) {
		int max = mas[0][0];
		int min = mas[0][0];
		int p = 0,t = 0,k= 0,d = 0;
		for (int i = 0; i<mas.length;i++) {
			for (int j = 0; j<mas[i].length;j++) {
				if (mas[i][j]>max) {
					max = mas[i][j];
					t = i;
					p = j;
				}
				if (mas[i][j]<min) {
					min = mas[i][j];
					k = i;
					d = j;
				}
			}
		}
		int temp = mas[t][p];
		mas[t][p] = mas[k][d];
		mas[k][d] = temp;
	}
	
	
	public static int[] findMaxInEveryRow(int[][] mas) {
		int max = mas[0][0];
		int[] a = new int[mas.length]; 
		for (int i = 0; i<mas.length;i++) {
			for (int j = 0;j<mas[i].length;j++) {
				if (mas[i][j]>max) {
					max=mas[i][j];
				}
			}
			a[i] = max;
			max = mas[i][0];
		}
		return a;
	}
	
	public static void printMax(int[] maxArray) {
		for(int i = 0;i<maxArray.length;i++) {
			System.out.printf("Максимальный элемент %d строки %3d", i,maxArray[i]);
			System.out.println();
		}
	}
	
	public static int[] findSumOtrElInEveryRow(int[][] mas) {
		int sum = 0;
		int[] a = new int[mas.length]; 
		for (int i = 0; i<mas.length;i++) {
			for (int j = 0;j<mas[i].length;j++) {
				if (mas[i][j]<0) {
					sum+=mas[i][j];
				}
			}
			a[i] = sum;
			sum = 0;
		}
		return a;
	}
	
	public static void printSum(int[] sumArray) {
		for(int i = 0;i<sumArray.length;i++) {
			System.out.printf("Сумма %d строки %3d", i,sumArray[i]);
			System.out.println();
		}
	}
	
	public static void printMatrix(int[][] a) {
		for (int i = 0; i<a.length;i++) {
			for (int j = 0;j<a[i].length;j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
	}

}
