package sqliteDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.*;

import dao.IGoods;
import util.sqliteDBUtil;

public class GoodsImpl implements IGoods {

	@Override
	public List<Goods> getAllGoods(){
		Connection Conn = sqliteDBUtil.getConnection();
		String sql = "select * from Goods";
		List<Goods> inventory = new ArrayList<Goods>();
		try {
			PreparedStatement pstmt = Conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				GoodsSpec spec = new GoodsSpec( null, null, null, null);
				spec.setType(rs.getString("type"));
				spec.setMaterial(rs.getString("material"));
				spec.setBrand(rs.getString("brand"));
				spec.setPrice(rs.getString("price"));
							
				Goods goods = new Goods(rs.getString("Number"),spec,rs.getString("quantity"));
				inventory.add(goods);				
			}			
			rs.close();
			pstmt.close();
			Conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch(Exception e){
		    e.printStackTrace();	
		}finally{
			try{
		         if(Conn!=null)
		        	 Conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return inventory;
 }
	public  Inventory Inventory()
	{
		Inventory inventory = new Inventory();
		sqliteDBUtil jdbc=new sqliteDBUtil();
		Connection conn = jdbc.getConnection();
		PreparedStatement pstat;
		ResultSet rs;
		try {
			pstat = conn.prepareStatement("select * from goods");
			rs = pstat.executeQuery();
			GoodsSpec spec = new GoodsSpec( null, null, null, null);
			spec.setType(rs.getString("type"));
			spec.setMaterial(rs.getString("material"));
			spec.setBrand(rs.getString("brand"));
			spec.setPrice(rs.getString("price"));
			inventory.add(rs.getString("Number"), spec,rs.getString("quantity"));
			}
		
		 catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				jdbc.closeConnection(conn);
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
		return inventory;
	}

	public void add(String Number, GoodsSpec spec,String quantity) {
			String sql="insert into Goods(Number,type,material,brand,price,quantity) values(?,?,?,?,?,?)";
			Connection conn=sqliteDBUtil.getConnection();
			
			try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setString(1, Number);
				ps.setString(2, spec.getType());
				ps.setString(3, spec.getMaterial());
				ps.setString(4,spec.getBrand());			
				ps.setString(5, spec.getPrice());
			    ps.setString(6,quantity);				
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
	}
	 public void delete(String serialNumber) {
			String sql="delete from guitar where serialNumber=?";
	//		DBUtil jdbc=new DBUtil();
			Connection conn=sqliteDBUtil.getConnection();
			
			try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setString(1, serialNumber);
				ps.executeUpdate();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}	
		}
	

	
}
