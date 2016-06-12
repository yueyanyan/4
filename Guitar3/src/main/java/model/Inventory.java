package model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
  private List<Goods> goods;

  public Inventory() {
    goods = new LinkedList();
  }

  //��Ӽ���
  public void add(String Number, GoodsSpec spec,String quantity) {
    Goods goods = new Goods(Number, spec,quantity);
    Goods.add(goods);
  }

  //ɾ������
  
  
  public void delete(String Number,GoodsSpec spec,String quantity){
  Goods guitar = new Goods(Number, spec,quantity);
	   Goods.delete(goods);
  }
  
  //ϵ�кŻ�ȡ����
  public Goods getGoods(String Number) {
    for (Iterator i = goods.iterator(); i.hasNext(); ) {
      Goods goods = (Goods)i.next();
      if (goods.getNumber()==(Number)) {
        return goods;
      }
    }
    return null;
  }

  //���Ҽ���
  public List search(GoodsSpec searchspec) {
    List search = new LinkedList();
    for (Iterator i = goods.iterator(); i.hasNext(); ) {
      Goods goods = (Goods)i.next();
      System.out.println(goods.goodsSpec().getType());
      System.out.println(searchspec.getType());
      if (goods.goodsSpec().matches(searchspec))
        search.add(goods);
    }
    return search;
  }

public List<Goods> getGoods() {
	return goods;
}

public void setGuitars(List<Goods> goods) {
	this.goods = goods;
}
  
}
