package model;



public class GoodsSpec {

	private String type;
	private String material;
	private String brand;
	private String price;
	
	public GoodsSpec(String type, String material, String brand, String price) {
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	
	
	public Boolean matches(GoodsSpec spec){
		if(spec.getType()!=null && !spec.getType().equals(type)){

			return false;
		}
		
		if(spec.getMaterial()!=null && !spec.getMaterial().equals(material)){

			return false;
		}

		if(spec.getBrand()!=null && !spec.getBrand().equals(brand)){

			return false;
		}
		if(spec.getPrice()!=null && !spec.getPrice().equals(price)){
//			System.out.print("back");
			return false;
		}
		return true;
		
	}
}