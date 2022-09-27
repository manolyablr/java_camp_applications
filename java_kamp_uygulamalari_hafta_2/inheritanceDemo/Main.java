package java_kamp_uygulamalari_hafta_2.inheritanceDemo;

public class Main {

	public static void main(String[] args) {

		//      OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		//      ogretmenKrediManager.hesapla();
		
        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new AskerKrediManager());

	}

}
