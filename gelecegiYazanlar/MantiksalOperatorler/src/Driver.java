
public class Driver {

	public static boolean test() {
		System.out.println("Test Calistirildi");
		return false;
	}
	public static void main(String[] args) {
		//false & false = false
		//false & true = false
		//true & false = false
		//true & true = true
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
		System.out.println(b & false);
		System.out.println(b & true);
		
		
		
		//false | false = false
		//false | true = false
		//true | false = false
		//true | true = true
		System.out.println(b | false);
		System.out.println(b && false);
		System.out.println(b && test());
		System.out.println(b || test());
		
	}

}
