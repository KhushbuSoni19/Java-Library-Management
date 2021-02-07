<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="first.Issue" %>
   <%@ page import="java.util.ArrayList"%> 
   <%@ page import= "first.StudentList" %>
   <%@ page import= "first.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>library</title>

<link rel="stylesheet" href="css/bootstrap.min.css">

<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-3.4.1.js"></script>

<!-- <script src="js/jquery.dataTables.min.js"></script>
 -->


</head>
<style>
 h2 
 {text-align: center; font-weight: bolder; color: teal;font-style: oblique; font-size: 50px;}
.s1{text-align: center; height:300px;width:300px;  }
</style>

<body>
		
  <div id="header">
   <jsp:include page= "HF/header.jsp"/>
  </div>
  <h2>Student List: </h2>
<hr>  <br><br><br>
 
 
 <%
try{
%>
<jsp:include page= "/StudentList" />
  <%
}
catch(Exception e)
{
	System.out.println("100");
	System.out.println(e);
}
  %> 
 
  <!-- 
    <form action="StudentList">
	
   <p> <h4>Do You want See List of All Student</h4>   <input type="submit" value="Click Here"></p>  
    -->    
      
    <div style="text-align:center" >   
        </form>
       <form action="Ssearch" name="sform">  
		<input type="text" name="name" ">  
	  <input type="submit" value="search" >
</form>
      
</div>
       <br><br>
        <table id="example" class="table table-striped table-bordered" style="width:100%">
          
          <tr > 
          <th><b>ID</b></th> 
          <th><b>Email</b></th> 
          <th><b>Name</b></th>
          <th><b>Date of Birth</b></th>
          <th><b>Branch</b></th>
          <th><b>semester</b></th>
          <th><b>Address</b></th>
          <th><b>Phone</b></th>
         </tr>
         
         
<%
try
	{
		ArrayList<Student> std = (ArrayList <Student>)request.getAttribute("data");
	
	for(Student b:std)
	{
	%>	
			 <tr> 
             
                <td><%=b.getid()%></td> 
                <td><%=b.getEm()%></td> 
                <td><%=b.getfname()%> <%=b.getlname()%></td> 
               <td><%=b.getdob()%></td>
                <td><%=b.getBranch()%></td> 
                <td><%=b.getSem()%></td>
                <td><%=b.getadd()%></td>
                <td><%=b.getph()%></td> 
            </tr> 
	<% 	
	}
	}
catch(Exception e)
	{
	System.out.println(e);
	}
%>
         
         
  </body>
  </html>