package controller;

import java.util.Scanner;

public class MyController
{
	
	public void start()
	{
		System.out.println("standard output for java :D");//when type println that starts a new line
		System.out.println("oh boy more words");
		System.out.print("same line");//when type just print it adds to same line
		System.out.print(" as this");
		
		questions();
	}
	
	private void questions()
	{
		System.out.print("what is your favorite color, or the meaning of life?");
		Scanner inputScanner = new Scanner(System.in);
		
		String answer = inputScanner .nextLine();
		System.out.println(answer);
		
		System.out.println("what is your hobby");
		answer = inputScanner.nextLine();
		System.out.println("hows your day so far");
		answer = inputScanner.nextLine();
		System.out.println("whens your birthday");
		answer = inputScanner.nextLine();
		
		inputScanner.close();
	}
	
}
