package study_test;

import java.util.Arrays;

/*思考数组的用法，找到相应的认知*/
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1= new int[] {12,45,12,3,56,89};
		//int[] num1 = {12,52,63,56,89};/数组另一种实现的方式，不用new方法；不知道是否存放在堆内存中；
		int[][] double_num1 = {{1,2,3},{4,5,6},{7,8,9,10}};//区别于规则与不规则数组
		int[] num2 = num1;
		int[] copiednum3 = Arrays.copyOf(num2, num2.length);
		Arrays.sort(num2);
		
		for(int a:num2) {     //for each a in copiednum3
			System.out.print(a+" ");
		}
		System.out.println();
		for(int[] num:double_num1) {
			for(int a:num) {
				System.out.print(a+" ");
			}
		}
	}

}
