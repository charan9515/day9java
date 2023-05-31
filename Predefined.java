package day9;

public class Predefined extends Thread{
	public void run() {
		System.out.println("run method "+Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println();
		Thread.currentThread().setName("run");
		System.out.println(Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		Multithr sc=new Multithr();
		sc.start();
		
		Thread.currentThread().setName("manii");
		System.out.println("main method"+Thread.currentThread().getPriority());
		System.out.println();
	}

}
