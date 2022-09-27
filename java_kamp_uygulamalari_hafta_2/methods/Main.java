package java_kamp_uygulamalari_hafta_2.methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 2;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer("sayı mevcuttur: " + aranacak);
		}

		else {
			mesajVer("sayı mevcut değildir: " + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
