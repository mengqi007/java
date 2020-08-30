package day3;

public class Peach {

	public Peach() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * 17 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
     * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
     * 以后每天早上都吃了前一天剩下 的一半零一个。
     * 到第10天早上想再吃时，见只剩下一个桃子了。
     * 求第一天共摘了多少。
     * 分析：用逆思维推推就明白了。第10天有一个桃子，第9天有4个，......
     */
	public static int peach(int dayNum)
	{
		int total = 1;
		for (int i = 1; i < dayNum; i++)
		{
			total = (total+1)*2;
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(peach(10));
	}

}
