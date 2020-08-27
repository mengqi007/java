package Study_Day;

public class MaxCommonDivisor {

	public MaxCommonDivisor() {
		// TODO Auto-generated constructor stub
	}
	public static int maxcommonDivisor(int a,int b)
	{
		int temp = 0;
		if (a < b)
		{
			temp = a;
			a = b;
			b = temp;
		}
		while (temp != 0)
		{
			temp = a % b;
			a = b;
			b = temp;
			//System.out.println(a + "  "+b+"  "+temp);//求公因数公式方式
		}
		return a;
	}
	
	public static int minCommonMultiple(int a,int b)
	{
		return a * b /maxcommonDivisor(a, b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxcommonDivisor(28, 36));
		System.out.println(minCommonMultiple(56, 28));
	}

}
