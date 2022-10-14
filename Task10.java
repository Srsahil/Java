package javaprograms;

public class Task10 {

	public static void main(String[] args) {
// Task 10- Write a program which will break the current execution if it find “Selenium”
		//Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]
	String arr[]= {"Java","JavaScript","Selenium","Python","Mukesh"};
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]=="Selenium")
		{
			{
				System.out.println("Selenium is found at array index of "+i);
				break;
			}
		}
	}


	}

}
