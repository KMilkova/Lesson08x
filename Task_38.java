package It.lhu.unit08.main;

//38. Найдите сумму двух матриц //подумать ещё

public class Task_38 {

	public static void main(String[] args) {
		int n = 4;
		int m = 5;
		int[][] a = Task_35.madeMatrix(n, m);
		int[][] b = Task_35.madeMatrix(n, m);
		
		int[][] matr;
		
		Task_11.printMatrix(a);
		System.out.println();
		Task_11.printMatrix(b);
		System.out.println();

		matr = matrixSum(a, b);
		Task_11.printMatrix(matr);
	}
	
	public static int[][] matrixSum(int[][] a,int[][] b){
		int[][] newMatr = new int[a.length][b[0].length];
		for (int i = 0; i<a.length;i++) {
			for (int j = 0; j<a[i].length;j++) {
				newMatr[i][j] = a[i][j]+b[i][j];
			}
		}
		return newMatr;
	}

}
