package Study_Day;

import java.util.stream.IntStream;

public class isNarcissisticNum {

	public isNarcissisticNum() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * ˮ�ɻ���������λ�������͵��ڸ���
	 * */
	public static boolean isnarcissisticNum(int num)
	{
		int a = num/100;
		int b = num/10%10;
		int c = num%10;
		
		return a*a*a+b*b*b+c*c*c == num;
	}
	
//	public static int[] findnarcissistiNum(int num)
//	{
//		return IntStream.rangeClosed(100,999).filter(answer::isNarcissisticNum).toArray();
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isnarcissisticNum(4355));
	}

}
