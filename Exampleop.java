package day9;

import java.util.Scanner;

class Assignment extends Thread{
	public void run() {
	Scanner sc=new Scanner(System.in);
	System.out.println("student assignment started");
	System.out.println("enter the chapter to do the assignment");
	int a=sc.nextInt();
	System.out.println("student completed the assignment"+a);
}
}

class print extends Thread{
public void run() {
	//start of printing//
		System.out.println("printing started");
		for(int i=0;i<4;i++) {
			System.out.println("cbit");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("printing ended");
}
class operation extends Thread{
	public void run() {
		System.out.println("multiplication:");
		int c=10;
		int b=20;
		System.out.println(c*b);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("multiplication ended");
	}
	
	
}
public class Exampleop{
	public static void main(String[] args) {
		Assignment as=new Assignment();
		print pr=new print();
		
		as.start();
        pr.start();
        
        
	}
	}
}

