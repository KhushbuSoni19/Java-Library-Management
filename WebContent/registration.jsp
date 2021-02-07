<%@ page contentType="text/html;charset=UTF-8" %>

<!doctype html>
<html lang="en">
  <head>
    <title>library</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery-3.4.1.js"></script> 
  </head>
  <style>
 h2 
 {text-align: center; font-weight: bolder; color: teal;font-style: oblique; font-size: 50px;}
th
 {font-size:23px;} 
  </style>
  <body>
  
  <div id="header">
   <jsp:include page= "HF/header.jsp"/>
  </div>
      
          <h2>Add Student</h2>
          <hr>
        <div class="container-fluid">
        <form action="A">
        <table id="form" align="center" class="table table-borderless table-sm"> 
            <tr>
                <th>Student's Login-Id:</th>
                <td><input type="text" name="ID" required></td>
            </tr>
        <tr> 
            <th>Student's Email id:</th>
                    <td>
                   <div class="input-group mb-3">
                   <input type="text" placeholder="Recipient's username" aria-label="Recipient's username" name="email" required >
                    </div>
                    </td>
  
        </tr>
      	<tr>
		            <th>Student's Name:</th>
	            	<td>
                  <div class="row">
                  <div class="col">
                   <input type="text"  placeholder="First name" name="sname1" required >
                   </div>
                <div class="col">
                <input type="text"  placeholder="Last name" name="sname2" required>
               </div>
              </div>
               </td>
      	</tr>
	    <tr>
		            <th>Date of Birth</th>
	            	<td><input type="text" name="cname" required></td>
    </tr>
    <tr>
                <th>Select Stream:</th>
		            <td>
		            <select name="ctype" required>
                    <option>Select here</option>
                    <option value="Electronics">Electronics Engineering</option>
                    <option value="information Technology">Information Technology</option>
                    <option value="Computer Science">Computer Science</option>
                    <option value="Civil Engineering">Civil Engineering</option>
                    <option value="Mechanical engineering">Mechanical Engineering</option>
                    </select>
                </td>
	</tr>
	<tr>
		              <th>Select Semester:</th>
                  <td><select name="sem" required>
                    <option>Choose-here</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                   <option value="7">7</option>
                   <option value="8">8</option> 
                     </select>
                    </td>
	</tr>
	<tr>
		                <th>Address:</th>
		                <td><textarea rows="5" name="address" required></textarea></td>
	</tr>

	<tr>
                		<th>Phone No:</th>
		                <td><input type="phone" name="phone" required></td>
	</tr>
	<tr >
		                  <th style="text-align: center;" colspan="2"><input type="submit" value="Register Here" ></th>
	</tr>
    </table>
    </form><hr></div>
      <script src="js/jquery-3.4.1.js" ></script>
      <script src="js/bootstrap.min.js" ></script>
    </body>
  </html>