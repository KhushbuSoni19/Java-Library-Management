	package first;
	
	import java.io.*;
	import java.sql.*;
	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

	public class ReturnBook extends HttpServlet {
		public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			response.setContentType("text/html");  
	         PrintWriter out=response.getWriter();  
	     	
	         
	         
	         try
			{		System.out.println("3");
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("delete from issuedbook where");
		
				}
	         catch(Exception e){System.out.println(e);}

}
	}