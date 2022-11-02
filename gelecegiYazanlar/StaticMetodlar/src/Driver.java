
public class Driver {

	public static void main(String[] args) {
	
		System.out.println(Math.PI);
		System.out.println(Math.pow(2, 3)); // kare küp 
		System.out.println(Math.sqrt(9)); // karekök
		System.out.println(Math.min(6, 2)); // kendisine verilen değerlerden küçük olanı geri döndürür.
		System.out.println(Math.max(6, 2));// kendisine verilen değerlerden büyük olanı geri döndürür.
		
		float f = 1.5f;
		System.out.println(Math.ceil(f)); // kendisine verilen değişkeni yukarı yuvarlar.
		System.out.println(Math.floor(f)); // kendisine verilen değişkeni aşağı yuvarlar.
		System.out.println(Math.round(f));// eğer sayı buçuktan küçükse aşağı buçuktan büyük ve eşitse yukarı yuvarlar.
		System.out.println(Math.random());// sıfır ile bir arasında sayı üretir.
		System.out.println(Math.random()*10); //sıfır ile on arasında bir sayı üretecektir.
		
	}

}
