package questions;

public class Overloading {
	
	public static void add(int a) {
		System.out.println("There is no number to add");
	}
	
	public static void add(int a, int b) {
		int c = a+b;
		System.out.println("Added : " + c);
	}
	
	public static void add(int a, int b, int c) {
		int d = a+b+c;
		System.out.println("Added : " + d);
	}
	

	public static void main(String[] args) {
		int a =5;
		int b= 3;
		int c=4;
		int d= 10;
		add(4);
		add(4,16);

	}

}
