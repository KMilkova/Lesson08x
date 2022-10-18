package It.lhu.unit08.main;

import java.util.Random;

//9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task_9 {

	public static void main(String[] args) {
		int n = 6;
		int[][] matr = madeMatrix(n);
		
		Task_11.printMatrix(matr);
		
		System.out.println();
		printDiogEl(matr);
	}
	
	public static int[][] madeMatrix(int n) {
		int[][] a = new int[n][n];
		Random rnd = new Random();
		
		for	(int i = 0; i<a.length;i++) {
			for (int j = 0; j<a[i].length;j++) {
				a[i][j] = rnd.nextInt(50);
			}
		}
		
		return a;	
	}
	
	public static void printDiogEl(int[][] a) {
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				if (i==j) {
					System.out.print(a[i][j]+ " ");
				}
			}
		}
	}


}
