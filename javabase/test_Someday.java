/**
 * 
 */
package test;

import java.time.LocalDate;

/**
 * @author 60424
 *
 */
public class test_Someday {

	/**
	 * 
	 */
	public test_Someday() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static int someDay(int year,int month,int day)
	{
		return LocalDate.of(year, month, day).getDayOfYear();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(someDay(2020,9,7));
	}

}
