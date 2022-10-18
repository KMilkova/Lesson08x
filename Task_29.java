package It.lhu.unit08.main;

import java.util.Random;

//29. Найти положительные элементы главной диагонали квадратной матрицы.

public class Task_29 {

	public static void main(String[] args) {
		int n = 5;
		int[][] matr = madeMatrix(n);
		Task_11.printMatrix(matr);
		printPolDiogEl(matr);
	}
	public static int[][] madeMatrix(int n) {
		int[][] a = new int[n][n];
		Random rnd = new Random();
		
		for	(int i = 0; i<a.length;i++) {
			for (int j = 0; j<a[i].length;j++) {
				a[i][j] = rnd.nextInt(50)-10;
			}
		}
		
		return a;	
	}
	
	public static void printPolDiogEl(int[][] a) {
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				if (i==j && (a[i][j]>=0)) {
					System.out.print(a[i][j]+ " ");
				}
			}
		}
	}

}
