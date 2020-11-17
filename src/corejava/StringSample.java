package corejava;

public class StringSample {

	public static void main(String[] args) {

		String abc;// Define the String
		abc = "Hi Dharani"; // Assign the value to String
//		String abc = "Hi Dharani";
		String bcd = "How are you?";

		System.out.println(abc);
		System.out.println(bcd);

		// print uppercase/ lowercase
		System.out.println(abc.toUpperCase());
		System.out.println(abc.toLowerCase());

		String a = "apple";
		String b = "Apple";

		if (a.equals(b)) {
			System.out.println("both the String are matching****");

		} else {
			System.out.println("both the String are NOT matching****");
		}
		
		
		if (a.equalsIgnoreCase(b)) {
			System.out.println("both the String are matching****");

		} else {
			System.out.println("both the String are NOT matching****");
		}

	}

}
