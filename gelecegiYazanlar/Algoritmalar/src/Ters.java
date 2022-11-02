import java.util.Scanner;

public class Ters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen Bir Yazi Giriniz : ");
		String text = scanner.nextLine();
		
		for (int i = text.length() -1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}

	}

}
