package It.lhu.unit08.main;

//13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task_13 {

	public static void main(String[] args) {
		int n = 6;
		int[][] matr = new int[n][n];
		
		Task_11.printMatrix(matr);
		
		System.out.println();
		
		int p=n;
		for (int i = 0;i<matr.length;i++) {
			for (int j = 0;j<matr[i].length;j++) {
				if (i%2==0) {
					matr[i][j] = j+1;
				}else {
					matr[i][j] = p-j;
				}
			}
		}
		Task_11.printMatrix(matr);


	}

}
