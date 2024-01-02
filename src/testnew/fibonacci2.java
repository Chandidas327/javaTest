package testnew;

public class fibonacci2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=1;
		int num3=0;
		for(int i=1;i<9;i++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
		}
		System.out.println(num3);

	}

}

