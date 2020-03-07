
public class hesap {

	private String kullaniciAdi;
	private String parola;
	private int bakiye;
	
	public hesap(String kullaniciAdi, String parola, int bakiye) {
		
		this.setKullaniciAdi(kullaniciAdi);
		this.setParola(parola);
		this.setBakiye(bakiye);
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
	
	
	public void paraYatir(int tutar) {
		bakiye += tutar;
		System.out.println("yeni bakiyeniz:" + bakiye);
	}
	
	public void paraCek(int tutar) {
		if(bakiye-tutar  < 0 ) {
			System.out.println("yeterli bakiyeniz yok");
			
		}
		else {
			bakiye -= tutar;
			System.out.println("yeni bakiyeniz: " + bakiye);
			
		}
	}
	
	
}
