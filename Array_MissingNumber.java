
public class Array_MissingNumber {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,10};
		
		int size = arr.length+1;
		int size2 = arr.length;
		
		int total = (size*(size+1))/2;
		int totalMissing = (size2*(size2+1))/2;
		
		System.out.println("total is : "+total);
		System.out.println("total is : "+totalMissing);
		
		System.out.println("Missing Element is : "+(total - totalMissing));
		
		
	}
}
