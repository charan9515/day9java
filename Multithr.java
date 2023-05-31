package day9;

public class Multithr extends Thread{
	
	public void run() {
	   System.out.println("run method");
		for(int i=1;i<5;i++) {
			System.out.println(i+"run");
		}
	}

	public static void main(String[] args) {
//		System.out.println("main method");
		Multithr sc=new Multithr();
//		sc.run();  //using run keyword run method first and next main method print//
		sc.start();   //using start reverse to run keyword//
		for(int i=1;i<5;i++) {
			System.out.println(i+"main");
		}
//		System.out.println("main method");
		

	}

}
