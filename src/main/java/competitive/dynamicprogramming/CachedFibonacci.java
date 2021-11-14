package competitive.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Like divide-and-conquer, DP solves the problem by combining the solutions of
 * multiple smaller problems, but what makes DP different is that the same
 * subproblem may reoccur. Therefore, a key to making DP efficient is caching
 * the results of inter mediate computations.
 * 
 * Caching intermediate results makes the time complexity for computing the nth
 * Fibonacci number linear in n, albeit at the expense of 0{n) storage.
 * 
 * @author Vijay
 *
 */
public class CachedFibonacci {
	private static final Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {		
		System.out.println("Enter the count of Fibonacci series..");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int fibonacciCount = Integer.parseInt(br.readLine().trim());
			Integer[] fibonacciArr = new Integer[fibonacciCount];
			Long startTime = System.currentTimeMillis();
			System.out.println("Start Time : " + startTime);
			for (int index = 0; index < fibonacciCount; index++) {
				if (index == 0 || index == 1) {
					fibonacciArr[index] = 1;
					continue;
				}else if (!cache.containsKey(index)) {
					cache.put(fibonacciArr[index], fibonacciArr[index - 1] + fibonacciArr[index - 2]);
					//fibonacciArr[index] = fibonacciArr[index - 1] + fibonacciArr[index - 2];
				}
			}
			List<Integer> fibonacciList = Arrays.asList(fibonacciArr);
			System.out.println(fibonacciList);
			Long endTime = System.currentTimeMillis();
			System.out.println("End Time : " + endTime);
			System.out.println("Time Elapsed=" + (endTime - startTime));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
