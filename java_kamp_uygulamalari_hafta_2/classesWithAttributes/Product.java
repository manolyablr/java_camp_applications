package java_kamp_uygulamalari_hafta_2.classesWithAttributes;

public class Product {

	// constructor class ismiyle aynı olur
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı blok çalıştı");
	}

	public Product() {}

	private String name;

	private String description;

	private double price;

	private int stockAmount;

	private int id;

	private String renk;

	private String kod;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;// burada classdaki kullanılacak (this)
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

}
