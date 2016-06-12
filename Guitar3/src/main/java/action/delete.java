package action;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import dao.IGoods;

import dao.dataAccess;

public class delete extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取系列号
		String Number=request.getParameter("Number");
		IGoods i = dataAccess.createIGoods();
		i.delete(Number);		
 	 	request.getRequestDispatcher("result.jsp").forward(request, response);
	}
}
