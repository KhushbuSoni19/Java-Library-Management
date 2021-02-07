package first;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
public class A extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		res.setContentType("text/html");  
		PrintWriter out = res.getWriter();
		String p1=req.getParameter("ID");
		String p2=req.getParameter("email");
		String p3=req.getParameter("sname1");
		String p4=req.getParameter("sname2");
		String p5=req.getParameter("cname");
		String p6=req.getParameter("ctype");	
		int p8= Integer.parseInt(req.getParameter("sem"));
		String p9=req.getParameter("address");
		String p12=req.getParameter("phone");
				try
				{				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
				PreparedStatement st=con.prepareStatement("insert into registration  values(?,?,?,?,?,?,?,?,?)");
			
				st.setString(1,p1);
				st.setString(2,p2 );
				st.setString(3,p3 );
				st.setString(4,p4);
				st.setString(5,p5);
				st.setString(6,p6);	
				st.setInt(7,p8);
				st.setString(8,p9);
				st.setString(10,p12);
							
				int i=st.executeUpdate();
				if(i>0)  
				{
				out.println("<p style=\"background-color: yellow; font-size:20px\"> SUCCEED:'You are successfully Added!!'<p>");
				 RequestDispatcher rd=req.getRequestDispatcher("registration.jsp");  
			        rd.include(req,res);
				}
				con.close();
				st.close();
				}
				catch(Exception e){System.out.println(e);}
	}
}