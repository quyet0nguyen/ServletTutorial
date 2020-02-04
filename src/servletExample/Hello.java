package servletExample;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
								throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("NAME");
		out.println("<HTML>");
		out.println("<HEAD><TITLE>HELLO, "+ name +"</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("HELLO, "+ name);
		out.println("</BODY></HTML>");
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
								throws ServletException, IOException{
		doGet(req,res);
	}
	
	public String getServletInfo() {
		return "A servlet that knows the name of the person to whom it's" + "saying Hello";
	}
}
