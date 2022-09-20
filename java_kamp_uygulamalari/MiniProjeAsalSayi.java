package java_kamp_uygulamalari;

public class MiniProjeAsalSayi {

	public static void main(String[] args) {
		int sayi =1;
		int kalan =0;
		boolean asalMi=true;
		
		if(sayi == 1) {
			System.out.println("Sayı Asal Sayı Değildir");
			return;
		}
		if(sayi < 1) {
			System.out.println("Geçersiz Sayı");
		}
		
		for (int i = 2; i < sayi; i++) {
			kalan = sayi%i;
			if(kalan == 0) {
				asalMi=false;
			}
		}
		if(asalMi) {
			System.out.println("Sayı Asal");
		}else {
			System.out.println("Sayı Asal Sayı Değildir");
		}
	}

}
