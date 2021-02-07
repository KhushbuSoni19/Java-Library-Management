<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="first.Issue" %>
   <%@ page import="java.util.ArrayList"%> 
   <%@ page import= "first.AddBook" %>
   <%@ page import= "first.Book" %>
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
  
  <h2>Add Book </h2>
<hr>  <br><br><br>

  		 <div style="text-align:center; font-size:20px">
 	<form action="Issue">
  <li>Subject's Name: <input type="text" name= "Bname"  required > </li><br>
  <li>Book's Number : <input type="text" name="Bid"  required></li><br>
  <li>Author's Name : <input type="text" name="Aname"  required> 	</li><br>
  <li>subject's Branch : <input type="text" name="branch"  required> </li><br><br>
  <input type="submit" >
  </form>
 </div>	
 <hr>
 <br><br>	
<div>
<h2>Book Details </h2>
<hr>  <br>
<%
try{
%>
<jsp:include page= "/AddBook" />
  <%
}
catch(Exception e)
{
	System.out.println("100");
	System.out.println(e);
}
  %> 
   
    <table border ="1" width="1300" align="center">--> 
      <!-- 	<form action="AddBook">	
  		<p> <h4>Do You want See BookList</h4>
  		    <input type="submit" value="Click Here"></p>  
      	 </form>
       -->
       
		<div style="text-align:center" >
		<form action="Bsearch" name="sform">  
		<input type="text" name="name" >  
	  <input type="submit" value="search" >
		</form>
		</div>

       <br><br>
        <table id="example" class="table table-striped table-bordered" style="width:100%">          
          <tr bgcolor="wheat" > 
          <th><b>Book's Name</b></th> 
          <th><b>Book's ID</b></th> 
          <th><b>Author Name</b></th>
          <th><b>Subject's Branch</b></th> 
         </tr> 
<%
try
	{
	System.out.println("1");
		ArrayList<Book> book = (ArrayList <Book>)request.getAttribute("data");
		System.out.println("1");	
	for(Book b:book)
	{
	%>	

			 <tr> 
                <td><%=b.getname()%></td> 
                <td><%=b.getid()%></td> 
                <td><%=b.getAname()%></td>
                <td><%=b.getBranch()%></td> 
            </tr> 
	<% 	
	System.out.println("1");
	}
	}
catch(Exception e)
	{
	System.out.println(e);
	}
%>
</table>
<hr>
</body>
</html>