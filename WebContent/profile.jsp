<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="first.LogIn" %>
 <%@ page import="first.A" %>
  <%@ page import="java.util.ArrayList"%> 
   <%@ page import= "first.IssueBook" %>
   <%@ page import= "first.Profile" %>
    
 <!doctype html>
<html lang="en">
  <head>
    <title>library</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.dataTables.min.js"></script>
  
   <script src="js/bootstrap.min.js"></script>
  <script src="js/jquery-3.4.1.js"></script> 
  </head>
  <style>
 h2 
 {text-align: center; font-weight: bolder; color: teal;font-style: oblique; font-size: 36px;}
th
 {font-size:23px;} 
td
{font-size:20px;}
  </style>
  
  <body>
  <div id="header">
   <jsp:include page="HF/header.jsp"/>
  </div>  
          <%
                  String i = (String) session.getAttribute("ID"); 
        		  String j = (String) session.getAttribute("email");
        		  String k = (String) session.getAttribute("first_name");
        		  String l = (String) session.getAttribute("last_name");
        		  String m = (String) session.getAttribute("DOB");
        		  String n = (String) session.getAttribute("branch");
        		  int o = (int)session.getAttribute("sem");
        		  String p = (String) session.getAttribute("Address");
        		  String r = (String) session.getAttribute("phone");
          %>
       <div style= "align-items: center"  class="card " >
  			<div class="card-body">
     <div>
     	<a  style="" class="btn btn-primary" href="Issuebook.jsp" role="button">Issue Book</a>
        <a  style="" class="btn btn-primary" href="issue.jsp" role="button">Return Book</a>
     </div>
    	               
           <br>
          <h3>Student Name : <% out.println(k+ "  " +l); %> </h3>
          <table  class="table table-borderless table-sm">
          <tr>
          <th>
           ID = <% out.println(i); %>
          </th>
          </tr>
          
          <tr> 
          <td>
          Email = <% out.println(j); %>
          </td>
          </tr>
          
          <tr>
          <td>
          Date of Birth = <% out.println(m); %>
          </td>
          </tr>
          
          <tr>
          <td>
          Branch = <% out.println(n); %>
          </td>
          </tr>
          
          <tr>
          <td>
          Semester = <% out.println(o); %>
          </td>
          </tr>
          
          <tr>
          <td>
          Address = <% out.println(p); %>
          </td>
          </tr>
          
          <tr>
          <td>
          Phone No. = <% out.println(r); %>
          </td>
          </tr>
          </table>
          </div>
    </div>
    </div> 
    
        <div style="align-item:center">
        <h2><% out.println(k+ "  " +l);%>'s Report</h2>
        <div>
        <br><br>
        </div>
       <div>
       <form action="ProfileDetails">
		<div style="text-align:center" >
  		<p> <h4>Do You want See Profile Details</h4>   <input type="submit" value="Click Here"></p>  
      	 </form>
      </div>
       <br><br>
       <table id="example" class="table table-striped table-bordered" style="width:100%">          
         <thead >
        <tr bgcolor="lightgrey">
		 
        <th>Book's Name</th>
        <th>Author's Name</th>
        <th>Book no.</th>
        <th>Subject Name</th>
         <th>Date</th>
         <th>return Book</th>
  
  <% 	
		  
  try
  	{
  		ArrayList<Profile> pr = (ArrayList <Profile>)request.getAttribute("data");
 		 for(Profile b :pr)
  		{
  %>	
  			 <tr>      
                  <td><%=b.getBname()%></td>
                  <td><%=b.getAname()%></td>
                  <td><%=b.getBid()%></td> 
                  <td><%=b.getBranch()%></td>
                  <td><%=b.getDate()%></td>
                  <td> <a  class="btn btn-primary" href="ReturnBook.jsp" role="button">Return Book</a>
     		</td>
         
              </tr> 
  	<% 
  
  	}
  	}
  	//}
  catch(Exception e)
  	{
  	System.out.println(e);
  	}
  %>

</body>
</html>