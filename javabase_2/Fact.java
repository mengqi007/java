package day3;

public class Fact {

	public Fact() {
		// TODO Auto-generated constructor stub
	}
	
    /** 22 利用递归方法求5! */
	public static int fact(int n)
	{
		if (n == 1) return 1;
		return fact(n-1)*n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
	}

}
