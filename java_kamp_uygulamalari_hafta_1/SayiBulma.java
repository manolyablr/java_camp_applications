package java_kamp_uygulamalari_hafta_1;

public class SayiBulma {

	public static void main(String[] args) {
		int sayilar [] = new int[] {1,4,5,7,8,9};
		int aranacak = 5;
		boolean varMi = false;
		for (int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Sayı Var");
		}else {
			System.out.println("Sayı Yok");
		}
	}

}
