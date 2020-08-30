package day3;

public class PeachThrow {

	public PeachThrow() {
		// TODO Auto-generated constructor stub
	}
	
	 /**
	  * 
	  * ???拿走一份不是还有4份吗？
     * 41 海滩上有一堆桃子，五只猴子来分。
     * 第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。
     * 第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，
     * 第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
     */
	public static int peachThrow()
	{
		int total = 6;
		for (int i = 1; i < 5; i++)
		{
			total = total * 5 + 1;
		}
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(peachThrow());
	}

}
