package Study_Day;

public class isWholeNumber {

	public isWholeNumber() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * 完数：一个数恰好等于它的因子之和
	 * */
	public static boolean iswholeNumber(int num)
	{
		int sum = 0;
		for (int i = 1; i <= num/2; i++)
		{
			if(num%i == 0)
				sum += i;
		}
		return sum == num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(iswholeNumber(6));
	}

}
