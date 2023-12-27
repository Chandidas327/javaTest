package testnew;
//Number of Steps to Reduce a Number to Zero

public class numTozero {
	public static void main(String[] args) {
        int num = 123;
        int count =0;
        
        while(num>0)
        {
        if(num%2==0)
        {
           
            num=num/2;
        }
        else
        {
           num=num -1;
           
        }
       count=count+1;
        }
       //count=count+1;
        System.out.println(count);
       
        
        


}}
