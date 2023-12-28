<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
UserDetails user2 = (UserDetails) session.getAttribute("userD");
if (user2 == null) {
	response.sendRedirect("login.jsp");
	session.setAttribute("Login-error", "Please Login For Continue...");
}
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>

	<%@include file="all_component/allcss.jsp" %>
	
</head>
<body>

	<%@ include file="all_component/navbar.jsp" %>
	<div class="container-fluid">
		
	
	  <div class="card py-3">
	    <div class="card-body text-center">
	      <img alt="" src="img/notesbg.png" class="img-fluid mx-auto" style="width: 300px">
	      <h1>START TAKING YOUR NOTES</h1>
	      <a href="addNotes.jsp"style="display: inline-block; margin: 20px auto; width: fit-content; border: 2px solid #ff004f; padding: 8px 30px; border-radius: 6px; text-decoration: none; color: #000; transition: background 0.5s;"
           onmouseover="this.style.backgroundColor='#ff004f';"
           onmouseout="this.style.backgroundColor='transparent';">Start Here</a>
	    </div>
	  </div>
	</div>
	<%@include file="all_component/footer.jsp" %>
</body>
</html>