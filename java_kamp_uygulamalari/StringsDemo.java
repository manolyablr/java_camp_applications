package java_kamp_uygulamalari;

public class StringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün Hava Çok Güzel.";
		System.out.println(mesaj);
		System.out.println("Eleman Sayısı" + mesaj.length());
		System.out.println("5. Eleman: "+ mesaj.charAt(4));
		System.out.println(mesaj.concat("Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("y"));
		char [] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('ü'));
		System.out.println(mesaj.lastIndexOf('e'));
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
	}

}
