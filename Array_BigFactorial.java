import java.math.BigInteger;

public class Array_BigFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 100;
        BigInteger result = BigInteger.valueOf(100);
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
		
		
	}

}
