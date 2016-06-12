package dao;

import java.util.List;

import model.Goods;
import model.Inventory;
import model.GoodsSpec;
public interface IGoods {
	public List<Goods> getAllGoods();
	public Inventory Inventory();
	public void add(String Number,  GoodsSpec spec,String quantity) ;
	public void delete(String Number) ;
}

