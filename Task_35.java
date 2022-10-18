package It.lhu.unit08.main;

import java.util.Random;

//35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task_35 {

	public static void main(String[] args) {
		int n = 6;
		int m = 5;
		int[][] matr = madeMatrix(n, m);
		Task_11.printMatrix(matr);
		System.out.println();
		changeMatrix(matr);
		Task_11.printMatrix(matr);
	}
	
	public static void changeMatrix(int[][] a) {
		int max = findMax(a);
		for (int i = 0; i<a.length;i++) {
			for (int j = 0;j<a[i].length;j++) {
				if (a[i][j]%2!=0) {
					a[i][j] = max;
				}
			}
		}
	}
	
	public static int findMax(int[][] a) {
		int max = a[0][0];
		for (int i = 0;i<a.length;i++) {
			for (int j = 0;j<a[i].length;j++) {
				if (a[i][j]>max) {
					max = a[i][j];
				}
			}
		}
		return max;
	}
	
	public static int[][] madeMatrix(int n, int m) {
		int[][] a = new int[n][m];
		Random rnd = new Random();
		
		for	(int i = 0; i<a.length;i++) {
			for (int j = 0; j<a[i].length;j++) {
				a[i][j] = rnd.nextInt(30);
			}
		}
		
		return a;	
	}

}
