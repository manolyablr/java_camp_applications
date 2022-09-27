package java_kamp_uygulamalari_hafta_2.recapDemo_classes;

public class Main {
	
    public static void main(String[] args) {
          DortIslem dortIslem=new DortIslem();
          int topla=dortIslem.topla(2,7);
          int cıkar=dortIslem.cıkar(3,6);
          int carp=dortIslem.carp(4, 2);
          int bol=dortIslem.bol(6,3);

          System.out.println(topla);
          System.out.println(cıkar);
          System.out.println(carp);
          System.out.println(bol);
    }



}