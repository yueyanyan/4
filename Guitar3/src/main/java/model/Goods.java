package model;

import java.util.List;

import model.GoodsSpec;

public class Goods {
	private String Number;
	private GoodsSpec spec;
	private String 	quantity;
	public Goods() {
	}
	


	public Goods(String Number, GoodsSpec spec,String quantity){
		// TODO Auto-generated constructor stub
		this.Number = Number;
		this.spec = spec;
		this.quantity = quantity;
		
	}



	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public GoodsSpec goodsSpec() {
		return spec;
	}
	public void setGuitarSpec(GoodsSpec goodsSpec) {
		this.spec = goodsSpec;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
			this.quantity = quantity;
	}



	public static void add(Goods goods) {
		// TODO Auto-generated method stub
		
	}



	public static void delete(List<Goods> goods) {
		// TODO Auto-generated method stub
		
	}

}
