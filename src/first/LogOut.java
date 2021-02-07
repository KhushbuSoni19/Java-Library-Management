package first;

import java.io.*;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogOut extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 response.setContentType("text/html");  
         PrintWriter out=response.getWriter();  

         out.println("<p style=\"background-color: yellow; font-size:20px\"> SUCCEED:'You are successfully Logged Out!'<p>");
			
         request.getRequestDispatcher("index.jsp").include(request, response);  
         
         
         HttpSession session=request.getSession();  
         session.invalidate();  
        
        
         out.close();  
		
		
	}
}
