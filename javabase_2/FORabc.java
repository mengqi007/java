package day3;

import java.util.Arrays;

public class FORabc {

	public FORabc() {
		// TODO Auto-generated constructor stub
	}
	 /**
     * 18 ����ƹ����ӽ��б������������ˡ�
     * �׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ�
     * �ѳ�ǩ���������������������Ա����������������
     * a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ�������
     */
	public static char[] forabc()
	{
		for (char a = 'x'; a <= 'z'; a++)//����a�Ķ���
			for (char b = 'x';b <= 'z'; b++)//����b�Ķ���
				if(a != b)
					for (char c = 'x'; c <= 'z'; c++)
						if (a != c && b != c)
							if(a != 'x'&& c!='x'&&c!='z')
								return new char[] {a,b,c};
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(forabc()));
	}

}
