import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int x =10;
		int y =20;
		/*
		if(x > y) {
			System.out.println("x y den buyuktur.");
			
		}else {
			System.out.println("x y den kucuktur.");
		}
		*/
		//System.out.println(x > y ?"x y den buyukur":"x y den kucuktur");

		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println(x>i ? "x i den buyuktur.":"x i den kucuktur.");
	}

}
