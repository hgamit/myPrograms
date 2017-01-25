package hackerRank;

class PalindromeExample{  
	
	private static int factorial(int n){
	    if(n<=1) return 1;
	    return n*factorial(n-1);  
	}
	
	public static void main(String args[]){  
	  int r,sum=0,temp;    
	  int n=4554;//It is the number variable to be checked for palindrome  
	  
	  temp=n;    
	  
	  //reversing number
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;   // regaining sum 
		   n=n/10;  // excluding last digit  
		  }   
		  
	  if(temp==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");    
	}  
} 

