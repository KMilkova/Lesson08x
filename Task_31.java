package It.lhu.unit08.main;

import java.util.Random;

//31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.

public class Task_31 {

	public static void main(String[] args) {
		int n = 5;
		int m = 4;
		int[][] matr = madeMatrix(n, m);
		Task_11.printMatrix(matr);
		System.out.println();
		int cnt = findCnt(matr);
		System.out.println(cnt);

	}
	
	public static int findCnt(int[][] a) {
		int cnt = 0;
		for (int i = 0;i<a.length;i++) {
			for (int j = 0;j<a[i].length;j++) {
				if (isDouble(a[i][j])) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	public static boolean isDouble(int b) {
		boolean check = false;
		int cnt =0;
		while (b!=0) {
			b/=10;
			cnt++;
		}
		if (cnt==2) {
			check = true;
		}
		return check;
	}
	
	public static int[][] madeMatrix(int n, int m) {
		int[][] a = new int[n][m];
		Random rnd = new Random();
		
		for	(int i = 0; i<a.length;i++) {
			for (int j = 0; j<a[i].length;j++) {
				a[i][j] = rnd.nextInt(1000);
			}
		}
		
		return a;	
	}

}
