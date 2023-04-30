package arrayOperations;

import java.util.Arrays;

public class FirstLastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,7,7,8,8,10};
		System.out.println(Arrays.toString(firstLastOccurance(arr,7)));
	}
	
	public static int[] firstLastOccurance(int[] arr,int key) {
	
		if(arr.length==0 || arr==null)
			return new int[] {-1,-1};
		int[] temp=new int[] {-1,-1};
		int first=Integer.MAX_VALUE,last=Integer.MIN_VALUE;	
		for(int i=0;i<arr.length;i++) {			
			if(arr[i]==key) {
				first= Math.min(first, i);
				last=Math.max(last, i);
				temp[0]=first;
				temp[1]=last;
			}
		}		
		return temp;	
	}
}
