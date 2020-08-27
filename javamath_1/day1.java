package Study_Day;

import java.util.Arrays;
import java.util.stream.Stream;

public class day1 {

	public day1() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * 最大的元素与第一位交换
	 * 最小的元素与最后一位交换
	 * */
	public static Double[] MaxstartMinend(Double[] arr)
	{
		Stream<Double> stream = Arrays.stream(arr);
		Double max = stream.max(Double::compareTo).get();
		Double min = stream.min(Double::compareTo).get();
		int i = Arrays.asList(arr).indexOf(max);
		arr[i] = arr[0];
		arr[0] = max;
		
		int j = Arrays.asList(arr).indexOf(min);
		arr[j] = arr[arr.length-1];
		arr[arr.length-1] = min;
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MaxstartMinend(new Double[]{34.44,23.44,76.44,0.0,32d}));
		
	}

}
