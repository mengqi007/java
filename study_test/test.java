package study_test;

import java.util.Arrays;

/*˼��������÷����ҵ���Ӧ����֪*/
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1= new int[] {12,45,12,3,56,89};
		//int[] num1 = {12,52,63,56,89};/������һ��ʵ�ֵķ�ʽ������new��������֪���Ƿ����ڶ��ڴ��У�
		int[][] double_num1 = {{1,2,3},{4,5,6},{7,8,9,10}};//�����ڹ����벻��������
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
