/**
 * 
 */
package Study_Day;

import java.util.Arrays;

/**
 * @author 60424
 *
 */
public class Isprime {

	/**
	 * 
	 */
	public Isprime() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 判断素数
	 * @param args
	 */
	public static boolean isprime(int num)
	{
		for (int j = 2; j < Math.sqrt(num); j++)
		{
			if (num % j == 0) 
				return false;
		}
		return true;
	}
	
	/*
	 * 一个偶数总能由两个素数之和表示
	 * */
	public static int[] obb2prime(int num)
	{
		if (num % 2 != 0) return null;
		for (int j = 2; j < num/2; j++)
		{
			if(isprime(j) && isprime(num-j))
				return new int[] {j,num-j};
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isprime(10));
		System.out.println(Arrays.toString(obb2prime(10)));
	}

}
