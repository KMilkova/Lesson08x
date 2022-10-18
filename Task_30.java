package It.lhu.unit08.main;

import java.util.Random;

//30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

public class Task_30 {

	public static void main(String[] args) {
		int n = 10;
		int m = 20;
		int[][] matr = madeMatrix(n, m);
		Task_11.printMatrix(matr);
		System.out.println();
		printRowNumbers(matr);
	}
	
	public static void printRowNumbers(int[][] a) {
		for (int i = 0; i<a.length;i++) {
			int cnt = 0;
			for (int j = 0;j<a[i].length;j++) {
				if (a[i][j]==5) {
					cnt++;
				}				
			}
			if (cnt >= 3) {
				System.out.println(i+" - строка где 5 встечается 3 раза и более");
			}
		}
	}
	
	public static int[][] madeMatrix(int n, int m) {
		int[][] a = new int[n][m];
		Random rnd = new Random();
		
		for	(int i = 0; i<a.length;i++) {
			for (int j = 0; j<a[i].length;j++) {
				a[i][j] = rnd.nextInt(15);
			}
		}
		
		return a;	
	}
}
