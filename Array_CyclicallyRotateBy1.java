
public class Array_CyclicallyRotateBy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6};
		
		int temp = arr[arr.length-1];
	
		for(int i=0; i<arr.length; i++) {
			//System.out.println("3");
			arr[i+1] = arr[i];
			System.out.println(arr[i+1]);
		}
		arr[0]=temp;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}
