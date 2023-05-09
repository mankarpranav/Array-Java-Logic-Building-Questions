
public class Array_FrequencyHalfOfSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
//		Output : 4
//		Explanation: The frequency of 4 is 5 which is 
//		greater than the half of the size of the array size. 
//
//		Input : A[] = {3, 3, 4, 2, 4, 4, 2, 4}
//		Output : No Majority Element
//		Explanation: There is no element whose frequency is 
//		greater than the half of the size of the array size.
		
		int arr[] = {3, 3, 4, 2, 4, 4, 2, 4};
				
		int count=1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}		
			}
			if(count > ((arr.length)/2)) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
