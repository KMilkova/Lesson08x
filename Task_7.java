package It.lhu.unit08.main;

import java.util.Random;

//7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.

public class Task_7 {

	public static void main(String[] args) {
		int n = 5;
		int[][] matr = madeMatrix(n);
		
		Task_11.printMatrix(matr);
		System.out.println();
		System.out.println(findSum(matr));

	}
	
	public static int findSum(int[][] matr) {
		int sum = 0;
		for (int i = 0; i<matr.length;i++) {
			for (int j = 0;j<matr[i].length;j++) {
				if (isOtr(matr[i][j])&& isNech(matr[i][j])) {
					sum+= Math.abs(matr[i][j]);
				}
			}
		}
		return sum;
	}
	
	public static boolean isOtr(int a) {
		boolean check = false;
		if (a<0) {
			check = true;
		}
		return check;
	}
	
	
	public static boolean isNech(int a) {
		boolean check = false;
		if (a%2 != 0) {
			check = true;
		
		}
		return check;
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

}
