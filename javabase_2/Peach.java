package day3;

public class Peach {

	public Peach() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * 17 ���ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ��
     * �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
     * �Ժ�ÿ�����϶�����ǰһ��ʣ�� ��һ����һ����
     * ����10���������ٳ�ʱ����ֻʣ��һ�������ˡ�
     * ���һ�칲ժ�˶��١�
     * ����������˼ά���ƾ������ˡ���10����һ�����ӣ���9����4����......
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
