package It.lhu.unit08.main;

import java.util.Random;

//39. Найдите произведение двух матриц.

public class Task_39 {

	public static void main(String[] args) {
		int n = 2;
		int m = 3;
		int k = 2;
		int[][] a = madeMatrix(n, m);
		int[][] b = madeMatrix(m, k);
		
		int[][] matr = new int[n][k];
		Task_11.printMatrix(a);
		System.out.println();
		Task_11.printMatrix(b);
		System.out.println();
		
		matr = proizv(a, b);
		
		Task_11.printMatrix(matr);
	}
	
	public static int[][] proizv(int[][] a,int[][] b){
		int[][] c = new int[a.length][b[0].length];
		for (int i = 0; i<a.length;i++){
			for (int p = 0;p<c[0].length;p++) {
				for (int j = 0;j<b.length;j++) {
					c[i][p]+=a[i][j]*b[j][p];
				}
			}
		}
		return c;
	}
	
	public static int[][] madeMatrix(int n, int m) {
		int[][] a = new int[n][m];
		Random rnd = new Random();
		
		for	(int i = 0; i<a.length;i++) {
			for (int j = 0; j<a[i].length;j++) {
				a[i][j] = rnd.nextInt(10);
			}
		}
		
		return a;	
	
	}
}
