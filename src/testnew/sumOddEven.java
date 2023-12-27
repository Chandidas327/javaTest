package testnew;

public class sumOddEven {

	public static void main(String[] args) {
		int num=123456;
		int sumOdd=0;
		int sumEven=0;
		int numAdd=0;
		int count=1;
		while (num>=1)
		{
			
			if (count%2==1)
			{
				sumOdd=sumOdd+(num%10);
			}
			else
			{
				sumEven=sumEven+(num%10);
			}
			count=count+1;
			num=num/10;
			
		}
		numAdd=sumOdd-sumEven;
		System.out.println(numAdd);
		
	}

}
