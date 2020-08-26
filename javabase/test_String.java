/**
 * 
 */
package test;
import test.test_String_num.*;
/**
 * @author 60424
 *
 */
public class test_String {

	/**
	 * 
	 */
	public test_String() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static boolean Ispalindrome(int num)
	{
		String str = String.valueOf(num);
		StringBuilder strbu = new StringBuilder(str).reverse();
		return str.equals(strbu.toString());
	}
	
	public static boolean Ispalindrome_1(int num) 
	{
		int ans = 0;
		while (num > ans)
		{
			ans = ans*10 + num%10;
			if (ans == 0) return false;//数字末尾为0则不可能是回文数字
			num /= 10;
		}
		return (num == ans||num == ans/10);
	}
	
	public static int intSub(int num,int start,int end)//从右边开始输出几位数
	{
		String str = String.valueOf(num);
		String sub = str.substring(str.length()-end, str.length()-start+1);
		return Integer.valueOf(sub);
	}
	
	public static int numStr(String s,String str)
	{
		int count = 0;
		int j = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if ((j = s.indexOf(str))>=0)
			{
				s = s.substring(str.length()+j);
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Ispalindrome(12321));
//		System.out.println(Ispalindrome_1(12321));
//		System.out.println(test_String_num.numabc("@@sdas cxc3232"));
//		System.out.println(test_String_num.numNum("@@sdas cxc3232"));
//		System.out.println(test_String_num.numspace("@@sdas cxc3232"));
//		System.out.println(test_String_num.numOther("@@sdas cxc3232"));
		System.out.println(intSub(123456789,4,7));
		System.out.println(numStr("asdfgfdertsa","as"));
	}

}
