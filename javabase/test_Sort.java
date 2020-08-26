/**
 * 
 */
package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author 60424
 *
 */
public class test_Sort {

	/**
	 * 
	 */
	public test_Sort() {
		// TODO Auto-generated constructor stub
	}
	
	public static String sortArray(int...array)
	{
		Arrays.sort(array);//�������ǲ���ʹ��lambda�ı��ʽ��
		return Arrays.toString(array);
	}
	
	public static String sortreverseArray(Integer... array)
	{
		Arrays.sort(array,(x,y)->y-x);
		return Arrays.toString(array);//Ϊʲô������Arrays.toString(Arrays.sort(array))
	}
	
	public static IntStream sortArray_2(int... array)
	{
		return IntStream.of(array).sorted();
	}
	
	public static int[] sortreverseArray_2(int... array)//�Ƚ���װ��������ڽ��в������
	{
		return  IntStream.of(array).boxed().sorted(Comparator.reverseOrder()).mapToInt(e->(int)e).toArray();
	}
	
	public static Integer[] reverseArray_3(Integer...array)
	{
		List<Integer> list = Arrays.asList(array);//����תlist���ϣ�listת����
		Collections.reverse(list);
		return list.toArray(new Integer[array.length]);
	}
	
	public static int[] reverseArray_4(int[] arr)
	{
		int[] array = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			array[i] = arr[arr.length-i-1];
		}
		return array;
	}
	/*
	 * *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sortArray(12,56,89,56,12,45,78));
		System.out.println(sortreverseArray(12,56,89,56,12,45,78));
		System.out.println(Arrays.toString(sortArray_2(12,56,89,56,12,45,78).toArray()));
		System.out.println(Arrays.toString(sortreverseArray_2(12,56,89,56,12,45,78)));
		System.out.println(Arrays.toString(reverseArray_3(12,56,89,56,12,45,78)));
		System.out.println(Arrays.toString(reverseArray_4(new int[]{12,56,89,56,12,45,78})));

	}

}
