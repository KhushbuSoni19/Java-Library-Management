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
import first.Student;
public class StudentList extends HttpServlet
{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();
		try
		{				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from registration");
				
				ArrayList<Student> std = new ArrayList<Student>(); 
				
				while(rs.next())
				{
				std.add(new Student(rs.getString("ID"),rs.getString("email"),rs.getString( "first_name"),rs.getString("last_name"),
										rs.getString("DOB") , rs.getString("branch"), rs.getString("sem"), rs.getString("Address"),rs.getString("phone")));
				}
				request.setAttribute("data", std); 
				
		        RequestDispatcher rd = request.getRequestDispatcher("Student.jsp");
		        rd.forward(request, response);
		        				
				con.close();
				st.close();
				
			}
				catch(Exception e){
					System.out.println(e);		
				}		
	}
	}