package java_kamp_uygulamalari_hafta_1;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'K';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli Harf");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce Sesli Harf");
			break;
		default:
			System.out.println("Sessiz Harf");
			break;
		}
	}

}
