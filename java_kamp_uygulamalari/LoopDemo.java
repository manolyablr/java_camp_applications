package java_kamp_uygulamalari;

public class LoopDemo {

	public static void main(String[] args) {
		//For
		for (int i = 0; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti.");
		
		//While
		int i = 1;
		while (i<10) {
			System.out.println(i);
		}
		System.out.println("While Döngüsü Bitti.");
		
		//Do While 
		int j =15;
		do {
			System.out.println("Loglandı");
			System.out.println(j);
			j++;
		} while (j<10);
		System.out.println("Do While Döngüsü Bitti.");
	}

}
