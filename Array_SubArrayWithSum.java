import java.util.Scanner;

public class Array_SubArrayWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,3,7,5};
		System.out.println("Enter sum: ");
		int sum = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(sum == (arr[i] + arr[j])) {
					System.out.println("("+i+","+j+")");
				}
			}
		}
	}

}
