package It.lhu.unit08.main;

//23. Сформировать квадратную матрицу порядка N по правилу и подсчитать количество положительных элементов в ней.

public class Task_23 {

	public static void main(String[] args) {
		int n = 5;
		double[][] matr = new double[n][n];
		matr = madeMatrix(matr);		
		printMatrix(matr);
		System.out.print("cnt + el : "+cnt(matr));
	}
	
	public static int cnt(double[][] a) {
		int cnt = 0;
		for (int i = 0;i<a.length;i++) {
			for (int j = 0;j<a[i].length;j++) {
				if (a[i][j]>0) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	public static void printMatrix(double[][] a) {
		for (int i = 0; i<a.length;i++) {
			for (int j = 0;j<a[i].length;j++) {
				System.out.printf("%.2f\t", a[i][j]);
			}
			System.out.println();
		}
	}
	
	public static double[][] madeMatrix(double[][] matr){
		for (int i = 0;i<matr.length;i++) {
			for (int j = 0;j<matr[i].length;j++) {
				matr[i][j] = Math.sin((Math.pow(i, 2)-Math.pow(j, 2)/matr.length));
			}
		}
		return matr;
	}

}
