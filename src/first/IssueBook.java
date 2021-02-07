package first;
import first.Book;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class IssueBook extends HttpServlet
{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();
		
		HttpSession session=request.getSession();
	   	System.out.println("12");
	   	String id = (String) session.getAttribute("ID");
		
	   	DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	    LocalDateTime now = LocalDateTime.now();
	    String a= date.format(now);
	   
	   	
	   	System.out.println("13");
	   	String p1= request.getParameter("Bid");
		String p2= request.getParameter("Bname");
		String p3= request.getParameter("Aname");
		String p4= request.getParameter("branch");
		
		
		
		try
		{				
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
		PreparedStatement st=con.prepareStatement("insert into IssuedBook values(?,?,?,?,?,?)");
	
		st.setString(1,id);
		st.setString(2,p1);
		st.setString(3,p2);
		st.setString(4,p3);
		st.setString(5,p4);
		st.setString(6,a);
		
		int i=st.executeUpdate();
		if(i>0)  
		{
		out.println("<p style=\"background-color: yellow; font-size:20px\"> SUCCEED:'You are successfully Added!!'<p>");
		}
		con.close();
		st.close();
		}
		catch(Exception e){System.out.println(e);}
	}
}