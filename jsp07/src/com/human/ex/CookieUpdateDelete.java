package com.human.ex;

import  java.io.IOException; 
import  java.io.PrintWriter; 
import  javax.servlet.ServletException; 
import  javax.servlet.annotation.WebServlet; 
import  javax.servlet.http.Cookie; 
import  javax.servlet.http.HttpServlet; 
import  javax.servlet.http.HttpServletRequest; 
import  javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet3")
public class CookieUpdateDelete extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public CookieUpdateDelete() {
		super();
	}
	protected void doGet(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException{
		//쿠키 수정 : 같은 키값에 새로운 이름을 넣는다
		Cookie cookie = new Cookie("name1", "newPsm1");
		cookie.setMaxAge(600); //쿠키 사용시간 설정, 600초 동안 쿠키 유지
		response.addCookie(cookie);
		//쿠키 삭제
		cookie = new Cookie("name", "newPsm1");
		cookie.setMaxAge(0); //삭제됨
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); //이게 있어야지 아래가 실행 가능
		out.println("<html>");
		out.println("<body>");
		out.println(cookie.getName() + "<br>");
		out.println(cookie.getValue() + "<br>");
		out.println(cookie.getMaxAge() + "<br>");
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
	}

}
