import java.util.Scanner;

public class Array_TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input: array = {12, 3, 4, 1, 6, 9}, sum = 24; 
//		Output: 12, 3, 9 
//		Explanation: There is a triplet (12, 3 and 9) present 
//		in the array whose sum is 24. 
//		Input: array = {1, 2, 3, 4, 5}, sum = 9 
//		Output: 5, 3, 1 
//		Explanation: There is a triplet (5, 3 and 1) present 
//		in the array whose sum is 9.
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5};
		System.out.println("Enter Sum: ");
		int sum = sc.nextInt();
		
		for(int i=0; i<arr.length-2; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				for(int k=j+1; k<arr.length; k++) {
					if((arr[i]+arr[j]+arr[k])== sum) {
						System.out.println(arr[i]+" "+arr[j]+" "+ arr[k]);
					}
				}
			}
		}
		
		
		
		
	}

}
