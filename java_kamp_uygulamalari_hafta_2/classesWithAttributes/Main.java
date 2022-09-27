package java_kamp_uygulamalari_hafta_2.classesWithAttributes;

public class Main {
    
	public static void main(String[] args) {

		// Product product = new Product(1,"laptop","asus laptop",22000,3,"gri");
		
          Product product = new Product();
          
          product.setName("Laptop");
          product.setId(1);
          product.setDescription("hp laptop");
          product.setPrice(22000);
          product.setStockAmount(3);
          product.setRenk("gri");

          System.out.println(product.getName());
          System.out.println(product.getId());
          System.out.println(product.getDescription());
          System.out.println(product.getPrice());
          System.out.println(product.getStockAmount());
          System.out.println(product.getKod());

          ProductManager productManager=new ProductManager();
          productManager.add(product);

    }



}
