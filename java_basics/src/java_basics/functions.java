package java_basics;

import java.util.Scanner;

public class functions {
	/*public static String names(String a)
    {
        System.out.print(a);
        return a;
    }*/



		// TODO Auto-generated method stub

		
		
		/*public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	          String a=sc.next();
	          names(a);
	}*/

	//arrays
	public static void main(String[] args) {
		System.out.print("please enter the no you want to enter");
		Scanner sc=new Scanner(System.in);
		          Integer a=sc.nextInt();
		          int numbers[]=new int[a];
		          for(int i=0;i<numbers.length;i++)
		          {
		        	          numbers[i]=sc.nextInt();
		          }
		          for(int i=0;i<numbers.length;i++)
		          {
		        System.out.print(numbers[i]);
		          }
		              System.out.print("enter your nt to search");
		              Integer b=sc.nextInt();
		              for(int i=0;i<numbers.length;i++)
		              {
		            	  if(numbers[i]==b)
		            	  {
		            		  System.out.println("no found ar x"+i);
		            	  }
		              }
		         
		}
	
}
