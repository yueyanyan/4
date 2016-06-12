package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.IGoods;
import dao.dataAccess;
import model.GoodsSpec;


public class add extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GoodsSpec spec = new GoodsSpec(null, null, null, null);
		
		
		spec.setType(request.getParameter("type"));
		spec.setMaterial(request.getParameter("material"));
		spec.setBrand(request.getParameter("brand"));
		spec.setPrice(request.getParameter("price"));
		
		String Number=request.getParameter("number");
		String quantity= String.valueOf(request.getParameter("quantity").toString());		
		IGoods i = dataAccess.createIGoods();
		i.add(Number, spec,quantity);		
 	 	request.getRequestDispatcher("result.jsp").forward(request, response);
	}
}
