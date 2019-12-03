package cm.oca.iuc.rs.metier;

public class Article {
	private Long code;
	private String libelle;
	private String brand;
	private int price;
	
	
	public Article() {
		super();
	}


	public Article(Long code, String libelle, String brand, int price) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.brand = brand;
		this.price = price;
	}


	public Long getCode() {
		return code;
	}


	public void setCode(Long code) {
		this.code = code;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}

