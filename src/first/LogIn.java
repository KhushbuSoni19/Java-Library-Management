package first;

import java.io.*;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogIn extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
	try
	{
		res.setContentType("text/html");  
		PrintWriter out = res.getWriter();
	   	String uname=req.getParameter("uname");
		
	   	HttpSession session=req.getSession();
	
		boolean flag=false;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("select * from registration where ID ='"+uname+"' ");
	
		while(rs.next())
		{ 
			if(uname.equals(rs.getString(1))) 
			{	
			flag=true;
			String a=rs.getString("ID");
			String b=rs.getString("email");
			String c=rs.getString("first_name");
			String d=rs.getString("last_name");
			String e=rs.getString("DOB");
			String f=rs.getString("branch");
			int g=rs.getInt("sem");
			String h=rs.getString("Address");
			String j=rs.getString("phone");
		
			session.setAttribute("ID", a);
			session.setAttribute("email", b);
			session.setAttribute("first_name", c);
			session.setAttribute("last_name", d);
			session.setAttribute("DOB", e);
			session.setAttribute("branch", f);
			session.setAttribute("sem", g);
			session.setAttribute("Address", h);
			session.setAttribute("phone", j);
	
		
			 RequestDispatcher rd=req.getRequestDispatcher("profile.jsp");  
		          rd.forward(req,res);

		         	HttpSession session1=req.getSession(); 	
					 session1.setAttribute("ID", a);
					 System.out.println("10");
					 
			RequestDispatcher rd1=req.getRequestDispatcher("IssueBook");  
			rd1.forward(req,res);
			       System.out.println("11");
	
			       HttpSession session2=req.getSession(); 	
					System.out.println("50");
			       session2.setAttribute("ID", a);
		    RequestDispatcher rd2=req.getRequestDispatcher("ProfileDetails");  
				 rd2.forward(req,res);
		       System.out.println("52");
			}
		}
			if(flag==false)
			{
				//out.println("Invalid Student's ID");
				out.println("<p style=\"background-color: red; font-size:20px\"> ERROR: Invalid Student's ID'<p>");
				RequestDispatcher rd=req.getRequestDispatcher("index.jsp");  
		        rd.include(req,res);
			}
			con.close();
			st.close();
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}	
	}			
}