package first;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import first.Profile;
public class ProfileDetails extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();
	
		HttpSession session=request.getSession();
	   	String id = (String) session.getAttribute("ID");
		
	   	try
		{		Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from IssuedBook where ID ='"+id+"' ");
		
				ArrayList<Profile> pr = new ArrayList<Profile>(); 
					
				while(rs.next())
					{
					pr.add(new Profile(rs.getString("id"),rs.getString("book_id"),rs.getString( "Book_name"),rs.getString("Author_name"),
										rs.getString("Branch"),rs.getString("date")));
					}
				request.setAttribute("data", pr); 
			    
				RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
		        rd.forward(request, response);
		    	
		        con.close();
				st.close();
		}
		catch(Exception e)
		{
		System.out.println(e);		
		}		
	}
}