package day3;

public class PeachThrow {

	public PeachThrow() {
		// TODO Auto-generated constructor stub
	}
	
	 /**
	  * 
	  * ???����һ�ݲ��ǻ���4����
     * 41 ��̲����һ�����ӣ���ֻ�������֡�
     * ��һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ������ֻ���ӰѶ��һ�����뺣�У�������һ�ݡ�
     * �ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��ֶ���һ������ͬ���Ѷ��һ�����뺣�У�������һ�ݣ�
     * ���������ġ�����ֻ���Ӷ����������ģ��ʺ�̲��ԭ�������ж��ٸ����ӣ�
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
