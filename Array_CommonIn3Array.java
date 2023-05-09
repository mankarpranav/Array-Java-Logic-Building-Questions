
public class Array_CommonIn3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Input: 
//			ar1[] = {1, 5, 10, 20, 40, 80} 
//			ar2[] = {6, 7, 20, 80, 100} 
//			ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
//			Output: 20, 80
		
			int ar1[] = {1, 5, 10, 20, 40, 80}; 
			int ar2[] = {6, 7, 20, 80, 100};
			int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
			
			for(int i=0; i<ar1.length; i++) {
				for(int j=0; j<ar2.length; j++) {
					for(int k=0; k<ar3.length; k++) {
						if(ar1[i]==ar2[j] && ar1[i]==ar3[k]) {
							System.out.println(ar1[i]);
						}
					}
				}
				
			}
			System.out.println("-------------------------------------------------");
			
			int arr1[] = {1, 5, 5};
			int arr2[] = {3, 4, 5, 5, 10}; 
			int arr3[] = {5, 5, 10, 20};
			
			int k=0;
			int j=0;
					
			for(int i=0; i<arr1.length; i++) {
				for(; j<arr2.length; j++) {
					for(; k<arr3.length; k++) {
						if(arr1[i]==arr2[j] && arr1[i]==arr3[k]) {
							System.out.println(arr1[i]);
						}
					}
				}
				
			}
		
		
		
	}

}
