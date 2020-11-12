package robber;

public class Robber {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 2;
		arr[1] = -4;
		arr[2] = 5;
		arr[3] = 12;
		arr[4] = -7;
		
		maxSum(arr);
	}
	
	public static int maxSum(int[] arr){
	    int n = arr.length;

	    int[] parent = new int[n];
	    parent[0] = -1;

	    int lastSum = 0; // last sum encountered
	    int lastPos = -1; // position of that last sum
	    int currSum = arr[0]; // current sum
	    int currPos = 0; // position of the current sum

	    for (int i = 1; i < n; i++) {
	        parent[i] = lastPos;  // save the last sum's position for this element

	        // below this it is mostly similar to what you have done;
	        // just keeping track of position too.
	        int probableSum = Integer.max(arr[i] + lastSum, arr[i]);
	        int tSum = currSum;
	        int tPos = currPos;
	        if(probableSum > currSum){
	            currSum = probableSum;
	            currPos = i;
	        }
	        lastSum = tSum;
	        lastPos = tPos;
	    }
	    System.out.println(currSum);
	    	    
	    int p = parent[n - 1];
	    System.out.print(arr[n - 1] + " ");
	    while (p != -1) {
	        System.out.print(arr[p] + " ");
	        p = parent[p];
	    }
	    
	    return currSum;
	}
}
