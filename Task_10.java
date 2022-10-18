package It.lhu.unit08.main;

//10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task_10 {

	public static void main(String[] args) {
		int n = 5;
		int m = 7;
		
		int[][] matr = Task_11.madeMatrix(n, m);
		Task_11.printMatrix(matr);
		System.out.println();
		
		printRow(matr,3);
		System.out.println();

		printCol(matr,4);
		
	}
	
	public static void printRow(int[][] a, int k) {
		System.out.println("Row - "+(k+1));
		for (int i = 0;i<a.length;i++) {
			for (int j = 0;j<a[i].length;j++) {
				if (i == k) {
					System.out.printf("%4d", a[i][j]);
				}
			}
		}
	}
	
	public static void printCol(int[][] a, int p) {
		System.out.println("Column - "+(p+1));
		for (int i = 0;i<a.length;i++) {
			for (int j = 0;j<a[i].length;j++) {
				if (j == p) {
					System.out.printf("%4d", a[i][j]);
					System.out.println();

				}
			}
		}
	}

}
