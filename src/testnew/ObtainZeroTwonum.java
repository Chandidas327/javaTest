package testnew;
//Count Operations to Obtain Zero
//You are given two non-negative integers num1 and num2.
//In one operation, if num1 >= num2, you must subtract num2 from num1, otherwise subtract num1 from num2.

public class ObtainZeroTwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=123;
		int num2=12;
		int count=0;
		while (num1>=1&&num2>=1)
		{
			if(num1>=num2)
			{
				num1=num1 - num2;
			}
			else
			{
				num2=num2-num1;
			}
			count=count+1;
		}
		System.out.println(count);

	}

}
