package It.lhu.unit08.main;

import java.util.Random;
import java.util.Scanner;

//27. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на
//соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

public class Task_27 {

	public static void main(String[] args) {
		int n = 5;
		int m = 4;
		int[][] matr = Task_11.madeMatrix(n, m);
		Task_11.printMatrix(matr);
		System.out.println();
		Scanner in = new Scanner(System.in);
		System.out.println("Номера столбцов № m");
		int c = in.nextInt();
		int b = in.nextInt();
		changeCols(matr,c,b);
		Task_11.printMatrix(matr);

	}
	
	public static void changeCols(int[][] a, int c, int b) {
		int temp = 0;
		for (int i = 0; i< a.length;i++) {
			for (int j = 0; j< a[i].length;j++) {
				if (j == c-1) {
					temp = a[i][j];
					a[i][j] = a[i][b-1];
					a[i][b-1] = temp;
				}
			}
		}
	}
	

}
