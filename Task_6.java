package It.lhu.unit08.main;

//6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task_6 {

	public static void main(String[] args) {
		int[][] mas = new int[][]{{22,11,6,8},{1,5,6,9},{6,5,8,1},{8,9,7,5},{5,9,7,5}};
							
		printMatrix(mas);
		System.out.println();

		
		for (int i = 0; i<mas.length;i++) {
			for (int j = 0; j<mas[i].length;j++) {
				if (j % 2 !=0) {
					if (mas[0][j]>mas[mas.length-1][j]) {
						System.out.printf("%2d ",mas[i][j]);						
					}
				}
			}
			System.out.println();
		}

	}
	
	public static void printMatrix(int[][] a) {
		for (int i = 0; i<a.length;i++) {
			for (int j = 0; j<a[i].length;j++) {
				System.out.printf("%2d ",a[i][j]);
			}
			System.out.println();
		}
	}

}
