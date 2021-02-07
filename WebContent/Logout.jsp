<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html lang="en">
  <head>
    <title>library</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    
    <link rel="stylesheet" href="css/bootstrap.min.css"> 

 </head>
  <style>
    .c1{height: 100px; width: 100px; }
   h1 {text-align: center; margin-top:50px}
   body {background-color:rgb(132, 186, 196)}
   #login .container #login-row #login-column #login-box {
  margin-top: 30px;
  max-width: 600px;
  height: 320px;
  border: 1px solid rgb(17, 17, 17);
  background-color:black;
}
#login .container #login-row #login-column #login-box #login-form {
  padding: 20px;
}
#login .container #login-row #login-column #login-box #login-form #register-link {
  margin-top: -85px;
}
  </style>
  <body>
    
    <nav class="navbar navbar-light bg-white">
         <a class="navbar-brand" href="#">
            <img src=p8.jpg width="380" height="120" class="d-inline-block align-top" alt="">    
         </a>
         
        <div>
        	<a  style="float: right; margin-left:10px " class="btn btn-primary" href="Student.jsp" role="button">Student List</a>
          	<a  style="float: right; margin-left:10px " class="btn btn-primary" href="issue.jsp" role="button">Add Book</a>
     		 <a style="float: right;" class="btn btn-primary" href="registration.jsp" role="button">Add student</a>
     		</div>   

               </nav>
         <div class="container-fluid">
          <h4 align="center" style="font-style:italic"><b>A library is like an island in the middle of a vast sea of ignorance, particularly if the library is very tall and the surrounding area has been floodedâ </b></h4>
        </div>
        <div class="container-fluid bg-secondary">
        <marquee style="display:inline-block; color: white; font-family: initial;"><h5>Welcome To The World of Books. I Promise, It will be Beneficial for You</h5></marquee>
        </div> 
         <div id="login">
    <h1> <img class="c1" src="p7.png" alt="" ></h1>     
      <div class="container">
          <div id="login-row" class="row justify-content-center align-items-center">
              <div id="login-column" class="col-md-6">
                  <div id="login-box" class="col-md-12">
                  
                    <form  action="LogIn" id="login-form" class="form" >
                     
                          <h2 class="text-center text-info">Log-In</h2>
                          <div style="margin-top: 40px;" class="form-group">
                            <label for="username" class="text-info">Student's Login-ID:</label><br>
                            <input type="text" name="uname" id="username" class="form-control">
                          </div>
                        
                          <input  type="submit" name="Login" class="btn btn-info btn-md" value="login"> 
                         
                          <div style="margin-top: 40px;" id="register-link" class="text-right">
                              <a href="registration.jsp" class="text-info">If Student is not added then click here</a>
                          </div>                        
                      </form>
                                        
                  </div>
              </div>
          </div>
      </div>
  </div>
</body>
</div>
</div>
<script src="js/jquery-3.4.1.js" ></script>
<script src="js/bootstrap.min.js" ></script>
  </body>
  </html>