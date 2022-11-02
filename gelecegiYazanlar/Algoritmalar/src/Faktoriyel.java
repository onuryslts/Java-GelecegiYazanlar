import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen Bir Sayi Giriniz : ");
		int number = scanner.nextInt();
		int sonuc = number;
		for (int i = number -1; i > 0; i--) {
			sonuc = sonuc * i;
		}
		System.out.println(sonuc);

	}

}
