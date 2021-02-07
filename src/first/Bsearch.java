package first;
import first.Book;
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

public class Bsearch extends HttpServlet
{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		response.setContentType("text/html");  
		PrintWriter ot = response.getWriter();
		
		String id=request.getParameter("name");
		
		if(id==null||id.trim().equals(""))
		{  
			ot.println("<p style=\"background-color: red; font-size:20px\"> ERROR: 'No Record Found!'<p>");
		}	
		else 
		{
		try
		{	
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from Book_Data where BiD like '"+id+"%'");
		
				if(!rs.isBeforeFirst()) 
				{      
					ot.println("<p style=\"background-color: red; font-size:20px\"> ERROR: 'No Record Found!'<p>");
					// ot.println("<p>No Record Found!</p>");
				    RequestDispatcher rd=request.getRequestDispatcher("issue.jsp");  
			        rd.include(request,response);
				
				}
				else
				{
							
					ArrayList<Book> book = new ArrayList<Book>(); 	
					while(rs.next())
					{
						book.add(new Book(rs.getString("book_name"),rs.getString("BiD"),rs.getString( "Author_name"),rs.getString("branch")));
					}
					request.setAttribute("data", book); 
					RequestDispatcher rd = request.getRequestDispatcher("issue.jsp");
			        rd.forward(request, response);
		
					con.close();
					st.close();				
				}
				}
					catch(Exception e)
					{
						System.out.println(e);		
					}		

		}
	}
	}