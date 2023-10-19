package com.human.ex;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myname")
public class NewFileServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public NewFileServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("화면에 찍힘");
        response.getContentType();
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("servletSubPage에서 나의 이름은 홍길동입니다.<br>");
        out.println("<a href='main/htmlmain.html'>htmlMain으로 이동</a><br>");
        out.println("<a href='main/jspmain.html'>jspMain으로 이동</a><br>");
        out.println("<a href='servletmain'>servletMain으로 이동</a><br>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
