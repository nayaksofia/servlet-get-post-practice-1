package com.sofia;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetHandler")
public class GetHandler extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		out.println("Name = " + name + "<br> Adress = " + address);
		
		out.println("</html></body>");
		
	}

}
