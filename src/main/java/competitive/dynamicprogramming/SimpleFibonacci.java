package competitive.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Mathematically, the nth Fibonacci number F{n) is given by the equation F{n) =
 * F{n - 1) + F{n - 2), with f(0) = 0 and f(l) = 1. A function to compute F{n)
 * that recursively invokes itself has a time complexity that is exponential in
 * n. This is because the recursive function computes some F{i)s repeatedly.
 * 
 * @author Vijay
 *
 */
public class SimpleFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the count of Fibonacci series..");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int fibonacciCount = Integer.parseInt(br.readLine().trim());
			Integer[] fibonacciArr = new Integer[fibonacciCount];
			Long startTime = System.currentTimeMillis();
			System.out.println("Start Time : "+startTime);
			for (int index = 0; index < fibonacciCount; index++) {
				if (index == 0 || index == 1) {
					fibonacciArr[index] = 1;
					continue;
				}
				fibonacciArr[index] = fibonacciArr[index - 1] + fibonacciArr[index - 2];
			}
			List<Integer> fibonacciList = Arrays.asList(fibonacciArr);
			System.out.println(fibonacciList);
			Long endTime = System.currentTimeMillis();
			System.out.println("End Time : "+endTime);
			System.out.println("Time Elapsed=" + (endTime - startTime));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
