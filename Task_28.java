package It.lhu.unit08.main;

//28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
//содержит максимальную сумму.

public class Task_28 {

	public static void main(String[] args) {
		int n = 8;
		int m = 6;
		int[][] matr = Task_35.madeMatrix(n, m);
		Task_11.printMatrix(matr);
		System.out.print(findCol(matr,m));
	}
	
	public static int findSum(int[][] a, int _j) {
		int sum = 0;
		for (int i = 0; i<a.length;i++) {
			sum+=a[i][_j];
		}
		return sum;
	}
	
	public static int findCol(int[][] a,int m) {
		int col = 0;
		int maxSum = findSum(a, 0);
			for (int j = 0;j<m;j++) {
//				System.out.printf("%4d", findSum(a, j));
				if (maxSum<findSum(a, j)){
					col = j;
				}
			}
		return col+1;
	}

}
