import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		/*
		int x;
		x = 10;
		//x++;//x = x+1;
		System.out.println(x++);
		System.out.println(x);
		System.out.println(--x);
		
		System.out.println(5%2);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz : ");
		int a = scanner.nextInt();
		System.out.println(a%2 == 0?"Cift Sayi":"Tek Sayi");
	*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen parolanizi giriniz: ");
		String password = scanner.nextLine();
		boolean isOk = password.equals("1234");
		System.out.println(isOk ? "Tebrikler Giris yaptiniz":"Hatali Giris Yaptiniz");
	}

}
