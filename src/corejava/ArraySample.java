package corejava;

public class ArraySample {
	public static void main(String[] args) {
		String abc = "Hi andi";
		// index start from '0'
		String[] bcd = { "Hi", "Dharani", "How ", "Are?", "dfgdfg" };
		System.out.println(bcd.length);

		// print array values
		for (int i = 0; i < bcd.length; i++) {
			System.out.println(bcd[i]);
		}
		
		//advance for loop;
		for (String x : bcd) {
			System.out.println(x);
			
		}

	}

}
