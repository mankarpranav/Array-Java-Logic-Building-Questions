
public class Array_SubsetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1} 
//		Output: arr2[] is a subset of arr1[]
//
//		Input: arr1[] = {1, 2, 3, 4, 5, 6}, arr2[] = {1, 2, 4} 
//		Output: arr2[] is a subset of arr1[]
//
		
		int arr2[] = {1, 2, 3, 4, 5, 6};
		int arr1[] = {1, 2, 4};
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					break;
				}
			}
		}	
	}
}
