package Study_Day;

import java.util.*;
public class Factor {

	public Factor() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * 将一个正整数分解成质因数,列如90 = 2*3*3*5
	 * */
	public static List<Integer> factor(int num)
	{
		List<Integer> list = new ArrayList<>();
		for (int i = 2; i <= num+1; i++)
		{
			while (num%i == 0 &&num != i)
			{
				list.add(i);
				num /= i;
				//System.out.println(i+ "  "+num);//语句进行输出比空想来的更加容易理解
			}
			if (num == i)
			{
				list.add(i);
				break;
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(factor(90).toArray()));
	}

}
