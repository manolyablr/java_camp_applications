package java_kamp_uygulamalari_hafta_1;

public class MukemmelSayi {

	public static void main(String[] args) {
		int sayi =16;
		int toplam =0;
		for (int i = 1; i < sayi; i++) {
			if(sayi%i == 0) {
				toplam = toplam+i;
			}
		}
		if(toplam == sayi) {
			System.out.println("Mükemmel Sayı");
		}else {
			System.out.println("Mükemmel Sayı Değil");
		}
		
	}

}
