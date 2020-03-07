import java.util.Scanner;

public class atm {
public void calis(hesap hesap) {
	
	login login = new login();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Akbank'a Hosgeldiniz..");
	System.out.println("******************");		
	System.out.println("Kullanici Girisi");
	System.out.println("******************");
	int girisHakki = 3;
	while(true) {
		if(login.login(hesap)) {
			System.out.println("Giris Basarili");
			break;
		}
		else {
			System.out.println("giris basarisiz");
			girisHakki--;
			System.out.println("giris hakki :" + girisHakki);
		}
		if(girisHakki == 0) {
			System.out.println("giris hakkiniz bitti");
			return;
		}
	}
	
	System.out.println("**********************");
	String islemler = "1. Bakiye Goruntuleme\n"
						+ "2. Para Yatirma\n"
						+ "3. Para Cekme\n"
						+ "Cikis icin q ya basiniz.. ";
	System.out.println("islemler");
	System.out.println("**********************");
	
	while(true) {
		System.out.println("Islem seciniz:");
		String islem = scanner.nextLine();
		if(islem.equals("q")) {
			break;
		}
		else if (islem.equals("1")){
			System.out.println("Bakiyeniz: " + hesap.getBakiye());
		}	
		else if(islem.equals("2")) {
			System.out.println("Yatirmak istediginiz tutar");
			int tutar = scanner.nextInt();
			scanner.nextLine();
			hesap.paraYatir(tutar);
			
		}
		else if(islem.equals("3")) {
			System.out.println("Cekmek istediginiz tutar");
			int tutar = scanner.nextInt();
			scanner.nextLine();
			hesap.paraCek(tutar);
		}
		else {
			System.out.println("Gecersiz Islem..");
		}
	}
}
}
