package java_kamp_uygulamalari_hafta_2.methods2;

public class Main {
	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = mesaj.substring(0, 2);
		System.out.println(yeniMesaj);

		int sayi = topla(5, 7);
		System.out.println(sayi);

		int toplam = topla2(2, 3, 5, 6);
		System.out.println(toplam);
	}

	public static void add() {
		System.out.println("eklendi");
	}

	public static void remove() {
		System.out.println("silindi");
	}

	public static void update() {
		System.out.println("güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam = toplam + sayi;
		}

		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}
}