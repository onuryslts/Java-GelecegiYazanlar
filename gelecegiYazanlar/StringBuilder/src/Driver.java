import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//String userInput = scanner.nextLine();
		//System.out.println(userInput.toUpperCase());
		StringBuffer buffer = new StringBuffer();
		System.out.print("Adiniz : ");
		buffer.append("Ad: ");
		buffer.append(scanner.nextLine());
		System.out.print("Soyadiniz : ");
		buffer.append(" , Soyad: ");
		buffer.append(scanner.nextLine());
		System.out.println(buffer.toString());
	}

}
