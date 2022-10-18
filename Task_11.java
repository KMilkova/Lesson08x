package It.lhu.unit08.main;

import java.util.Random;

//11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
//строка слева направо, третья строка справа налево и так далее.


public class Task_11 {

	public static void main(String[] args) {
		int n = 5;
		int m = 4;
		int[][] matr = madeMatrix(n, m);
		printMatrix(matr);
		System.out.println();
		finalPrintMatrix(matr);

	}
	
	public static int[][] madeMatrix(int n, int m) {
		int[][] a = new int[n][m];
		Random rnd = new Random();
		
		for	(int i = 0; i<a.length;i++) {
			for (int j = 0; j<a[i].length;j++) {
				a[i][j] = rnd.nextInt(50);
			}
		}
		
		return a;	
	}
	
	public static void finalPrintMatrix(int[][] a) {
		for (int i = 0;i<a.length;i++) {
			if (i % 2 == 0) {
				for (int j = a[i].length-1; j>=0;j--) {
					System.out.printf("%4d", a[i][j]);
				}	
			}
			else {
				for (int j = 0; j<a[i].length;j++) {
					System.out.printf("%4d", a[i][j]);
				}
			}
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
