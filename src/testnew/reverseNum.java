package testnew;

public class reverseNum {

	public static void main(String[] args) {
		int n = 1267783;
		int rev = 0;
		while(n>0)
		{
			rev = n%10;
			System.out.print(rev);
			n = n/10;
		}
		
	}

}
