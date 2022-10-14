package javaprograms;

public class Task3 {

	public static void main(String[] args) {
//Task 3-  Write a program to print the average of below 5 numbers [10,90.78,111,8989,7876]


		double arr []= {10,90.78,111,8989,7876};
		double p=0.0;
		for(int i=0;i<arr.length;i++)
		{
			 p=p+arr[i];
		}
		System.out.println("Average of the number = "+p/5);
		

	}

}
