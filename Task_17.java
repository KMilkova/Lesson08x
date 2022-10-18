package It.lhu.unit08.main;

//17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task_17 {

	public static void main(String[] args) {
		int n = 8;
		int[][] matr = new int[n][n];
		
		Task_11.printMatrix(matr);
		
		System.out.println();		
		for (int i = 0; i<matr.length;i++) {
			for (int j = 0;j<matr[i].length;j++) {
				if(i == 0 || i == matr.length-1 || j == 0 || j == matr[i].length-1 ) {
					matr[i][j] = 1;
				}
			}
		}
		Task_11.printMatrix(matr);

	

	}

}
