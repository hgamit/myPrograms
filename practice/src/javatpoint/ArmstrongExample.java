package javatpoint;

class ArmstrongExample{  
    public static void main(String[] args)  {  
      int c=0,a,temp;  
      int n=153;//It is the number to check armstrong  
      temp=n;  
	      while(n>0)  
	      {  
	      a=n%10; // getting last digit
	      n=n/10; // removing last digit 
	      c=c+(a*a*a);  // calculating armstrong
	      }  
      if(temp==c)  
      System.out.println("armstrong number");   
      else  
          System.out.println("Not armstrong number");   
     }  
 }  
