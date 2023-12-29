package testnew;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		    int x =120;
		    int y =x;
		        int count =0;
		        int rev =0;
		        int rev1=0;
		        for (;x>0;count++)
		        		{
		        		rev =x%10;
		        		x=x/10;
		        		rev1=rev1*10+rev;
		        		
		        			}
		       
		        if (rev1==y)
		        {
		        	System.out.println("true");
		        }
		        else
		        {
		        	System.out.println("false");
		        }

}}
