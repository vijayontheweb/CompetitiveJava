package competitive.bitwise;

/**
 * 
 * @author Vijay
 *
 */
public class BitwiseExample {

	public static void main(String[] args) {
		/*
		 * Left shift is equivalent to multiplying the bit pattern with 2^k ( if we are
		 * shifting k bits ). For Example, M << N = M * 2^N i.e 15 << 3 = 15 * 2^3 = 120
		 * Right shift is equivalent to dividing the bit pattern with 2^k ( if we are
		 * shifting k bits ). For Example, M >> N = M / 2N i.e. 32 >> 5 = 32 / (2^5) = 3
		 * 
		 */

		System.out.println(15 << 3);
		System.out.println(32 >> 5);
		
		/*
		 * Check if a number is power of 2 
		 */
		int number,orgNumber = 4;
		number = orgNumber;
		
		while(number%2 == 0) {
			number = number/2;
		}
		if(number == 1) {
			System.out.println("The given number "+orgNumber+" is a power of 2");
		}else {
			System.out.println("The given number "+orgNumber+" is NOT a power of 2");
		}
		number = orgNumber<<<1;
		System.out.println(number);
		if(number == 1) {
			System.out.println("The given number "+orgNumber+" is a power of 2");
		}else {
			System.out.println("The given number "+orgNumber+" is NOT a power of 2");
		}

	}

}
