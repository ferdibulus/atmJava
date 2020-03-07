
public class main {
public static void main(String args[]) {
	atm atm = new atm();
	hesap hesap = new hesap("ferdi", "123456", 500);
	atm.calis(hesap);
	System.out.println("Programdan cikiliyor");
}
}
