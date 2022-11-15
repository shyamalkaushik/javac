package java_basics;

public class Controlflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean hungry=true;
		if(hungry)
		{
		System.out.print("hi hi");	
		}
		else
		{
			System.out.print("hello");	
		}
	 int hungerRating =5;
	if(hungerRating <6)
	{ 
		System.out.println("Not Hungry");
		}else
		{
			System.out.println("I'm starving ...");
			}
	
	int favorite_Temp = 75; 
	int current_Temp = 60;
	String opinion;
	if(current_Temp < favorite_Temp -30)
	{ 
		opinion="It's Pretty Darn Cold ..."; 
		}
	else if
	(current_Temp < favorite_Temp - 20)
	{
		opinion = "I'ts kinda cold out ..."; 
		} 
	else if
	(current_Temp > favorite_Temp + 10)
	{
		opinion="It's hot out ";
		
	}
	
	else 
	{
	opinion = "it's a be utiful day";
	} 
	System.out.println(opinion);


	
	int month=1;
	switch(month)
	{
		case 1:System.out.print("h");
		break;
	}
	}
	
	}

	


