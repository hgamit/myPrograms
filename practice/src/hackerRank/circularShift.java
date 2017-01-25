package hackerRank;


public class circularShift {

	public static void main(String[] args) {
	    //Scanner in=new Scanner(System.in);

	    long[] arr={256741038, 623958417, 467905213, 714532089, 938071625};
        long min=999999999,max=0;
        
        for(int i=0;i<arr.length;i++)
            {
            if(arr[i]>max) {
                max = arr[i];
            } else if (arr[i]<min){
                min = arr[i];
            }
                        
        }
        System.out.println(min+" "+max);
	}
}
