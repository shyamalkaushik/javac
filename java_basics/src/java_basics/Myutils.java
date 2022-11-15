package java_basics;
import example.exam;

public class Myutils {
  
	
	
	public static String printSomeJunk(String argument)
	{ 
		exam.main();
		System.out.println("Some bla bla bla " + argument);
		return argument; 
		}
	public static void printSomeJunk(int argument)
	{ 
		System.out.println("Integer passed in: " + argument);
		}
	public static void sum2Numbers(int firstArg, int secondArg)
	{ System.out.println(firstArg+secondArg); 
	} 
	public static int add10(int someArgument)
	{ int result = someArgument+10; return result; 
	}
	
}


