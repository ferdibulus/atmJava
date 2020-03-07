import java.util.Scanner;

public class login {
	
	public boolean login(hesap hesap) {
		Scanner scanner = new Scanner(System.in);
		String kullaniciadi ;
		String parola;
		
		System.out.println("Kullanici adi:");
		kullaniciadi = scanner.nextLine();
		
		System.out.println("Parola:");
		parola = scanner.nextLine();
		
		if(hesap.getKullaniciAdi().equals(kullaniciadi) && hesap.getParola().equals(parola)) {
			return true;
		}
		else {
			return false;
		}
	}
}
