package servletExample;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
						throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>HELLO WORLD</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<BIG>HELLO WORLD</BIG>");
		out.println("</BODY>");
		out.println("</HTML>");
	}						
}
