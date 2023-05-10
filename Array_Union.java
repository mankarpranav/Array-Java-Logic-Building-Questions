
public class Array_Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input: arr1[] = {1, 3, 4, 5, 7}
//        arr2[] = {2, 3, 5, 6} 
//		Output: Union : {1, 2, 3, 4, 5, 6, 7} 
		
		int arr1[] = {1,3,4,5,7};
		int arr2[] = {2,3,5,6};
		int union[] = new int[arr1.length+ arr2.length];
		int j=0;
		for(int i=0; i<arr1.length && j<arr2.length; i++) {
			for( ; j<arr2.length; j++) {
				if (arr1[i] < arr2[j])
	                System.out.print(arr1[i++] + " ");
	            else if (arr2[j] < arr1[i])
	                System.out.print(arr2[j++] + " ");
	            else {
	                System.out.print(arr2[j++] + " ");
	                i++;
	            }
			}
		}
 
		
	}

}
