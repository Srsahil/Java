package javaprograms;

public class Task2 {

	public static void main(String[] args) {
//Task 2-  Write a program to print the sum of below 5 numbers [10,90.78,111,8989,7876]
		
		
		double arr []= {10,90.78,111,8989,7876};
		double p=0.0;
		for(int i=0;i<arr.length;i++)
		{
			 p=p+arr[i];
		}
		
		System.out.println("sum of the number = "+p);
		

	}

}
