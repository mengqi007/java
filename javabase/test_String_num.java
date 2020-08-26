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
	
	public static int numOther(String str)//在[^a-zA-Z\\d ]中^是必要的
	{
		return str.length() - str.replaceAll("[^a-zA-Z\\d ]", "").length();
	}
}
