import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		/*
		int number = 10;
		boolean result = number < 0;
		if(result) {
			System.out.println("Pozitif bir sayi");
		}else {
			System.out.println("Negatif bir sayi");
		}
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen Bir Sayi Giriniz : ");
		int sayi = scanner.nextInt();
		if(sayi == 0) {
			System.out.println("Sayi 0");
		}else if(sayi %2 == 0) {
			System.out.println("Cift bir sayi");
		}else {
			System.out.println("Tek bir sayi");
		}
		*/
		/*
		int number = 75;
		if(number<100) {
			System.out.println("Sayi 100'den kucuk");
			if(number>50) {
				System.out.println("Sayi 50'den buyuk");
			}
		
		}
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen Bir Sayi Giriniz : ");
		int number = scanner.nextInt();
		if(number<100 && number >=1) {
			System.out.println("Girdiginiz sayi 2 Basamakli");
		} else if(number<1000 && number >=100){
			System.out.println("Girdiginiz sayi 3 Basamakli");
		}
		else if(number<10000 && number >=1000){
			System.out.println("Girdiginiz sayi 4 Basamakli");
		}else {
			System.out.println("Girdiginiz sayi 1 ve 9999 arasinda degil.");
		}
		
	}

}
