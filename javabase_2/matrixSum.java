package day3;

import java.util.Arrays;

public class matrixSum {

	public matrixSum() {
		// TODO Auto-generated constructor stub
	}

	/** 29 ��һ��3*3����Խ���Ԫ��֮�� */
	public static int[] MatrixSum(int[][] matrix)
	{
		int sum_left = 0,sum_right = 0;
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				if (i == j)  sum_left += matrix[i][j];
				if (i + j == matrix.length -1) sum_right += matrix[i][j];
			}	
		}
		return new int[] {sum_left,sum_right};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(MatrixSum(new int[][] {{21,43,54},{65,78,90},{32,56,86}})));
	}

}
