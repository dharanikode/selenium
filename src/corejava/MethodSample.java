package corejava;

public class MethodSample {
	// Method / Function: Block/Group of statements is ntg but Method, it can
	// re-usable
	public static void add() {
		int a = 90;
		int b = 80;
		int c;
		c = a + b;
		System.out.println(c);
	}

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		System.out.println("main method");
		add();
		System.out.println("************************");
		add(154, 6);
		add(45, 8);
	}

}
