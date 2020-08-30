package day3;

public class recusionFact {

	public recusionFact() {
		// TODO Auto-generated constructor stub
	}
	/** 21 Çó1+2!+3!+...+20!µÄºÍ */
	public static long recusionfact(int n)
	{
		if (n == 1) return 1;
		return n*recusionfact(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		for (int i = 1; i <= 20; i++)
		{
			sum += recusionfact(i);
		}
		System.out.println(sum);
	}

}
