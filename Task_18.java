package It.lhu.unit08.main;

//18. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task_18 {

	public static void main(String[] args) {
		int n = 6;
		int[][] matr = new int[n][n];
		
		Task_11.printMatrix(matr);
		
		System.out.println();
		int p = 0;
		
		for (int i = 0; i<matr.length;i++) {
			p = n-i;
			for (int j = 0;j<matr[i].length;j++) {
				if(j<p) {
					matr[i][j] = i+1;
				}
			}
		}
		Task_11.printMatrix(matr);

	}

}
