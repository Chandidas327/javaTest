package testnew;

public class javanew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	            int addEven = 0;    
	            int i=0;
	            int addOdd=0;
	            int n =100;
	            int sum;
	            while(i<=n)
	            {
	            	if(i%2==0)
	            	{
	            		addEven = addEven + i;
	            		
	            	}
	            
	                else
	                 {
	                	 addOdd = addOdd + i;
	                	
	                 }
	            	i++;
	            }
	              sum = addEven - addOdd;
	              System.out.println(sum);
	            
	            
	        
	        }    
	       

	}


