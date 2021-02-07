package first;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;
import java.util.ArrayList;
import first.Book;
public class Issue extends HttpServlet
{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("11");
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();
		System.out.println("12");
		String s1=request.getParameter("Bname");
		String s2=request.getParameter("Bid");
		String s3=request.getParameter("Aname");
		String s4=request.getParameter("branch");
		System.out.println("13");
		try
		{				
			System.out.println("14");
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
				PreparedStatement st=con.prepareStatement("insert into Book_data  values(?,?,?,?)");
				
				System.out.println("15");
				st.setString(1,s1);
				st.setString(2,s2 );
				st.setString(3,s3 );
				st.setString(4,s4);
				int i=st.executeUpdate();
				System.out.println("16");
				if(i>0)  
				{
					out.println("<p style=\"background-color: yellow; font-size:20px\"> ERROR:'You are successfully Added!!'<p>");
					RequestDispatcher rd=request.getRequestDispatcher("issue.jsp");  
			        rd.include(request,response);
		
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