package java_kamp_uygulamalari_hafta_2.classes;

public class Main {

    public static void main(String[] args) {
          CustomerManager customerManager = new CustomerManager();
          customerManager.add();
          customerManager.remove();
          customerManager.update();

          //value type stackte oluşur.
          int sayi1 =10;
          int sayi2=20;
          
          sayi2=sayi1;
          sayi1=30;
          System.out.println(sayi2);

          //diziler referans tiptir.heap de obje oluşturur.
          int [] sayilar1 = new int [] {1,2,3};
          int [] sayilar2= new int[] {4,5,6};

          sayilar2=sayilar1;// sayilar1 ve sayilar2 heap de aynı yeri tutuyor artık. (sayilar1'in yerini)
          
          sayilar1[0]=10;
          System.out.println(sayilar2[0]);

    }



}