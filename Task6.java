package day4;

public class Task6

{
	public static void main(String arg[])	
	{
//Task 6- Write a program to print all prime numbers from 1-1000
              
	for(int i=2;i<=1000;i++)
	{
	int c=0;
	for(int j=1;j<=i;j++)
	{
	   if(i%j==0)
	   {
	        c++;        
	   }
	}	
	if(c==2)
	       System.out.println(i);     
	}
	}
}