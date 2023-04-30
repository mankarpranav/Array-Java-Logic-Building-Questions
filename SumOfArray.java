package arrayOperations;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[] { 1, 5, 9,14 };
		int[] arr2 = new int[] { 3, 4, 7 };
		twoSum(arr1,14);

	}
	
	public static void twoSum(int[] arr,int sum) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]+arr[j]==sum) {
					System.out.println("sum of pairs is "+arr[i]+"  "+arr[j]);
					return;
				}				
		}
	}

}
