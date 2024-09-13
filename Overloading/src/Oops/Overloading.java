// package Oops;

public class Overloading {

	public static void main(String[] args) {

		Demo d = new Demo();
		// Demo2 d = new Demo2();
		// d.add(3.3);
		// d.add(77.66); //at the time of compilation we decides this value...means currently
		d.add();
		d.add(12,34);
		System.out.println(Demo.add(12,34,56));
		System.out.println(d.add("Laptop", 70));
		System.out.println(d.add(70, "Laptop"));
	}

}


class Demo{
	public void add() {
		System.out.println("Add from demo");
	}
	
	public void add(int i,int j) {
		System.out.println(i + j);
	}
	
	static int add(int i,int j, int k) {
		return (i+j+k);
	}
	
	protected String add(String str,int i) {
		return (str + i);
	}
	protected String add(int i, String str) {
		return (i + str);
	}
	final void add(float f) {
		System.out.println("demoooo");
	}
	
}

// class Demo2 extends Demo{
// 	public void add(double d) {
// 		System.out.println("Add method from child class: ");
// 	}
// }