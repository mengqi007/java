package Study_Day;

public class rabbitNum {

	public rabbitNum() {
		// TODO Auto-generated constructor stub
	}
	
     /** 01 3������ÿ���¶���һ������ */
	public static int RabbitNum(int n)
	{
		if (n == 1||n == 2) return 1;
		return RabbitNum(n-1)+RabbitNum(n-2); //���õݹ�ķ�ʽ��ֵ
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RabbitNum(6));


	}

}
