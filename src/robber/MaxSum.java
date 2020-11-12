package robber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxSum {
	@Test
	void test() {
		int[] arr = new int[5];
		arr[0] = 2;
		arr[1] = -4;
		arr[2] = 5;
		arr[3] = 12;
		arr[4] = -7;
		
		assertEquals(14, Robber.maxSum(arr));
	}
	
	@Test
	void test2() {
		int[] arr = new int[5];
		arr[0] = 2;
		arr[1] = -4;
		arr[2] = 5;
		arr[3] = 12;
		arr[4] = -7;
		
		assertEquals(12, Robber.maxSum(arr));
	}
	
	@Test
	void test3() {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = -4;
		arr[2] = 5;
		arr[3] = 11;
		arr[4] = -9;
		
		assertEquals(12, Robber.maxSum(arr));
	}

}
