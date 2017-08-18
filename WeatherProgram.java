package WeatherP;

import java.util.Scanner;

public class WeatherProgram {

	public static void main(String[] args) 
	{
	Scanner cin = new Scanner(System.in);
    double c = 0;

	System.out.println("Welcome. Please enter your temperature in degrees F 'Fahrenheit'");
	
	int f = cin.nextInt();
	
	//Equation to convert F to C
	{
	c = (5*((double)f-32)/9);
	System.out.println((double)c);
	}
	
	//Define if it's cold or not
	if(f<32)
	{
		System.out.println("You beter have a coat on...");
	}
	else if (f>90)
	{
		System.out.println("Time to kick it back at the beach bruh");
	}
	else
	{
	    System.out.println("Wear whatever you want... It's not hot nor cold.");
	}
	
	//Printing final degrees in c
	System.out.println("The temperature is " + c + " degrees centigrade!");
	cin.close();
	
	}
}