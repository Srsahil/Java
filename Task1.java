package javaprograms;

public class Task1 {

	public static void main(String[] args) {
//Task 1 – Write a program to swap two number. For example a=10 and b=20 output should be a=20 and b=10

		
		int a=10;
		int b=20;
		System.out.println("a, b before swap "+a+"," +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping a and b " +a+","+b);

	}

}
