package arrayOperations;

public class MaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		 
		 System.out.println(maxSumSubArray(a));
		 System.out.println(maxSumSubArr(a));

	}
	
	public static int maxSumSubArray(int[] arr) {
		// {-2, -3, 4, -1, -2, 1, 5, -3};
		int max_sum=Integer.MIN_VALUE;
		int max_ending=0;
		for(int i=0;i<arr.length;i++) {
			max_ending = max_ending + arr[i]; //4-1=3-2=1+1=2+5=7
			if(max_sum < max_ending) //7<
				max_sum = max_ending;//4
			if(max_ending<0)
				max_ending=0;
		}
		return max_sum;
	}
	
	public static int maxSumSubArr(int[] arr) {
		int curr_max,final_max;
		curr_max=final_max=arr[0];
		for(int i=1;i<arr.length;i++) {
			curr_max=Math.max(arr[i], curr_max+arr[i]);
			final_max=Math.max(final_max, curr_max);
		}
		return final_max;
	}

}
