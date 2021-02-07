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

public class AddBook extends HttpServlet
{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("2");
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();
		try
		{		System.out.println("3");
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from Book_Data");
				System.out.println("4");
		
				ArrayList<Book> book = new ArrayList<Book>(); 
				System.out.println("5");

				while(rs.next())
				{
					book.add(new Book(rs.getString("book_name"),rs.getString("BiD"),rs.getString( "Author_name"),rs.getString("branch")));
				 }
				request.setAttribute("data", book); 
				System.out.println("6");

		        RequestDispatcher rd = request.getRequestDispatcher("issue.jsp");
		        rd.forward(request, response);
				System.out.println("7");

				con.close();
				st.close();				
		}
				catch(Exception e){
					System.out.println(e);		
					System.out.println("8");

				}		
	}
	}