<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resident</title>
<%@include file="all_component/all_css.jsp"%>
</head>
<body style="background-color: #f0f1f2;">
 <%@include file="all_component/navbar.jsp"%>
         <div class="container p-2">
           <div class="col-md-10 offset-md-1">
             <div class="card">
               <div class="card-body">
                 <div class="text-center text-success">
                    <i class="fas fa-user-friends fa-3x"></i>
                    
                    <%--<c:if test="${not empty succMsg}">
                           <div class="alert alert-success" role="alert">${succMsg }</div>
                           <c:remove var="succMsg"  />
                    </c:if>--%>
                    <h5>Resident</h5>
                    </div>
                    <div class="form-row">
                    <div class="form-group col-md-4">
                    
                    <label>Status</label> <select name="status"
                    class="custom-select " id="inlineFormCustomSelectPref">
                    <option selected>Choose.....</option>
                    <option value="Accept">Accept</option>
                    <option value="Decline">Decline</option>
                    </select>
                    </div>
                    </div>
 
</body>
</html>