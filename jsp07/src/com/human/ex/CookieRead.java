package com.human.ex;

import  java.io.IOException; 
import  java.io.PrintWriter; 
import  javax.servlet.ServletException; 
import  javax.servlet.annotation.WebServlet; 
import  javax.servlet.http.Cookie; 
import  javax.servlet.http.HttpServlet; 
import  javax.servlet.http.HttpServletRequest; 
import  javax.servlet.http.HttpServletResponse; 

@WebServlet("/CookieServlet2")
public class CookieRead extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public CookieRead() {
		super();
	}
	protected void doGet(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException{
		Cookie cookies[] = request.getCookies();
		 //  for(int i=0;i<cookies.length;i++) { 
		 //  cookies[i].getName(); 
		 //  } 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		for (Cookie cookie:cookies) {
			out.println(cookie.getName() + "<br>");
			out.println(cookie.getValue() + "<br>");
			out.println(cookie.getMaxAge() + "<br>");
		}
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
	}
	

}
