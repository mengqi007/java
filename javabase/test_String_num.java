/**
 * 
 */
package test;

/**
 * @author 60424
 *
 */
public class test_String_num {

	/**
	 * 
	 */
	public test_String_num() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static int numabc(String str)
	{
		return str.length() - str.replaceAll("[a-zA-Z]", "").length();
	}
	
	public static int numspace(String str)
	{
		return str.length() - str.replaceAll(" ", "").length();
	}
	
	public static int numNum(String str)
	{
		return str.length() - str.replaceAll("\\d", "").length();
	}
	
	public static int numOther(String str)//��[^a-zA-Z\\d ]��^�Ǳ�Ҫ��
	{
		return str.length() - str.replaceAll("[^a-zA-Z\\d ]", "").length();
	}
}
