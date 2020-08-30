package day3;

import java.util.Arrays;

public class FORabc {

	public FORabc() {
		// TODO Auto-generated constructor stub
	}
	 /**
     * 18 两个乒乓球队进行比赛，各出三人。
     * 甲队为a,b,c三人，乙队为x,y,z三人。
     * 已抽签决定比赛名单。有人向队员打听比赛的名单。
     * a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
     */
	public static char[] forabc()
	{
		for (char a = 'x'; a <= 'z'; a++)//代表a的对手
			for (char b = 'x';b <= 'z'; b++)//代表b的对手
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
