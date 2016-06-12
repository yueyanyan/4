package action;

    import java.io.IOException;
	import java.util.LinkedList;
	import java.util.List;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;


import dao.IGoods;
import dao.dataAccess;
import model.GoodsSpec;

	@SuppressWarnings("serial")
	public class search extends HttpServlet{
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}
		@SuppressWarnings("rawtypes")
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			GoodsSpec spec = new GoodsSpec(null, null, null, null);
			spec.setType(request.getParameter("type"));
			spec.setMaterial(request.getParameter("material"));
			spec.setBrand(request.getParameter("brand"));
			spec.setPrice(request.getParameter("price"));
			
			String Number=request.getParameter("number");
			String quantity= String.valueOf(request.getParameter("quantity").toString());			
			List search = new LinkedList();
			IGoods i = dataAccess.createIGoods();
			search = i.Inventory().search(spec);					
			System.out.println(search);			
			request.setAttribute("res", search);
			if (!search.isEmpty()) {
		        request.getRequestDispatcher("result.jsp").forward(request,response);
		      } else {
		        System.out.println("对不起，暂无此商品。");
		      }	
		}
	}


