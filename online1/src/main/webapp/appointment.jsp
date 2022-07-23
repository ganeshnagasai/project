<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin: Add Details</title>
<%@include file="all_component/all_css.jsp"%>
</head>
<body style="background-color: #f0f1f2;">
<%@include file="all_component/navbar.jsp"%>

     <div class="container p-2">
       
           <div class="col-md-10 offset-md-1">
             <div class="card">
               <div class="card-body">
                 <div class="text-center text-success">
                    <i class="fas fa-user-friends fa-3x" ></i>
                    
                    
                    <h5>Visitor Details</h5>
                    </div>
                    
                    <form action="visitor_Details" method="post">
                      <div class="form-group">
                      <label>Visitor Name</label><input type="text" name="name"
                        required class="form-control" >
                      </div>
                      <div class="form-group">
                        
                      <label>Flat Number</label><input type="text" name="flatnumber"
                        required class="form-control" >
                      </div>
                      
                      <div class="form-group">
                      <label>Relation</label><input type="text" name="relation"
                      required class="form-control">
                      </div>
                      <div class="form-group">
                      <label>Mobile Number</label><input type="text" name="number"
                      required class="form-control">
                      </div>
                      <div class="form-group">
                      <label>In Time</label><input type="text" name="time"
                      required class="form-control">
                      </div>
                      <div class="form-group">
                      <label>Purpose</label>
                      <textarea required rows="4" cols="" name="desc"
                                class="form-control"></textarea>
                      </div>
                      <button class="btn btn-success">Submit Request</button>
                    </form>
                    </div>
                </div>
                </div>
           </div>
        </div>
</body >
</html>