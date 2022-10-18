package It.lhu.unit08.main;

//8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов
//массива.

public class Task_8 {

	public static void main(String[] args) {
		int n = 5;
		int m = 4;
		int[][] matr = Task_11.madeMatrix(n, m);
		Task_11.printMatrix(matr);
		System.out.println();
		
		
		int cnt = 0;
		for (int i = 0;i<matr.length;i++) {
			for (int j = 0;j<matr[i].length;j++) {
				if (matr[i][j] == 7) {
					cnt++;
				}
			}
		}
		
		System.out.print(cnt);

	}

}
