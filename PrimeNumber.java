import java.util.*;
public class PrimeNumber{
	public static boolean primeNumber(int n){
			if (n<=1) {
				return false;
			}
			for (int i=2;i<=Math.sqrt(n) ;i++ ) {
				if(n%i==0){
					return false;
				}
			}
			return true;
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n = sc.nextInt();
		//make a primeNumber method to find out the primeNumber
		

		//now we create to condition after calling primeNumber
		if (primeNumber(n)) {
			System.out.println(n+" is a prime Number");
		}
		else {
			System.out.println(n+" is not a prime Number");
		}
	}
}