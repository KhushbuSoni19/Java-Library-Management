<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>library</title>

<link rel="stylesheet" href="css/bootstrap.min.css">
   <script src="js/bootstrap.min.js"></script>
  <script src="js/jquery-3.4.1.js"></script> 
</head>
 
 <script>
//var today = new Date();
//var date = today.getFullYear()+'/'+(today.getMonth()+1)+'/'+today.getDate();
document.getElementById("theDate").value = date;
//var d=document.write(date);
</script>
  
<style>
 h2 
 {text-align: center; font-weight: bolder; color: teal;font-style: oblique; font-size: 50px;}
.s1{text-align: center; height:300px;width:300px;  }
</style>
<body>
		
  <div id="header">
   <jsp:include page= "HF/header.jsp"/>
  </div>
  
  	<h2>Issue Book </h2>
	<hr>  <br><br><br>
    <div style="text-align:center; font-size:20px">
 	<form action="IssueBook">
	 <li>Book's Number : <input type="text" name="Bid"  required></li><br>
  	 <li>Subject's Name : <input type="text" name= "Bname"  required > </li><br>
  	  <li>Author's Name : <input type="text" name="Aname"  required> 	</li><br>
 	  <li>subject's Branch : <input type="text" name="branch"  required> </li><br>
 		<input type="submit" >
  </form>
 
	</body>
</html>
