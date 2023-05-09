
public class Array_PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input: array[]= {5, 10, 20, 15}
//		Output: 20
//		Explanation: The element 20 has neighbors 10 and 15, 
//		both of them are less than 20.
//
//		Input: array[] = {10, 20, 15, 2, 23, 90, 67}
//		Output: 20 or 90
//		Explanation: The element 20 has neighbors 10 and 15, 
//		both of them are less than 20,
//		similarly 90 has neighbors 23 and 67.
		
		
		int arr[]= {5, 10, 20, 15};
		
		for(int i=0; i<arr.length; i++) {
			
			if(i==0 && (arr[i] > arr[i+1])) {
				System.out.println(arr[i]);
			}
			
			if((i>0 && i<arr.length-1) && ((arr[i]>arr[i-1]) && (arr[i]>arr[i+1]))) {
				System.out.println(arr[i]);
			}
			
			if(i==(arr.length-1) && (arr[i]>arr[i-1])) {
				System.out.println(arr[i]);
			}	
		}
	}
}
