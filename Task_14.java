package It.lhu.unit08.main;

//14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task_14 {

	public static void main(String[] args) {
		int n = 6;
		int[][] matr = new int[n][n];
		
		Task_11.printMatrix(matr);
		
		System.out.println();
		
		int p=0;
		for (int i = matr.length-1;i>=0;i--) {
			for (int j = 0;j<matr[i].length;j++) {
				if (p==j) {
					matr[i][j] = j+1;
				}else {
					matr[i][j] = 0;
				}
			}
			p = n-i;
		}
		Task_11.printMatrix(matr);


	}
}
