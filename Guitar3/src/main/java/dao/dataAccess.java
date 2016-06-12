package dao;

public class dataAccess {
	
	private static String daoName = "sqliteDao";

	public static IGoods createIGoods() {
		IGoods result = null;
		try {
			Object o = Class.forName(daoName + "." + "GoodsImpl").newInstance();
			result = (IGoods)o;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
