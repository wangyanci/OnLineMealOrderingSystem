package com.wangyanci.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.wangyanci.pojo.TablePageListResult;
import com.wangyanci.service.OrderService;
import com.wangyanci.serviceimp.OrderServiceImpl;

public class ListOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListOrder() {
		super();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		OrderService service = new OrderServiceImpl();
		int page = 1;
		int rows = 30;

		String page1 = request.getParameter("page");
		if (page1 != null) {
			page = Integer.parseInt(page1);
		}
		String rows1 = request.getParameter("rows");
		if (rows1 != null) {
			rows = Integer.parseInt(rows1);
		}

		try {
			TablePageListResult result = service.gerAllOrder(page, rows);
			Gson gson = new Gson();
			String string = gson.toJson(result);
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write(string);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}