<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
input{
border-radius: 5px;
}
body {
	background: url('http://www.demo.amitjakhu.com/login-form/images/bg.png');
	font-family: "HelveticaNeue-Light", "Helvetica Neue Light", "Helvetica Neue", Helvetica, Arial, "Lucida Grande", sans-serif;
	font-weight:300;
	text-align: left;
	text-decoration: none;
	height: 500px;
}
.formcont
{
position: absolute;
background: white;
padding: 20px;
border-radius:10px;
box-shadow: 5px 5px 5px #888888;
	width:33%;
	left:33%;
	top:15%;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="formcont">
<h3>Create Event</h3>
<form name="form" method="post" action="Loading.jsp">
<table>
<tr><td>EID:</td><td><input type="text" name="eid"></td></tr>
<tr><td>EName:</td><td><input type="text" name="ename"></td></tr>
<tr><td>Description:</td><td><input type="text" name="description"></td></tr>
<tr><td>Max :</td><td><input type="text" name="max"></td></tr>
<tr><td>Count:</td><td><input type="text" name="count"></td></tr>
<tr><td>Hostname:</td><td><input type="text" name="hostname"></td></tr>
<tr><td>Category:</td><td><input type="text" name="Category"></td></tr>
<tr><td>Contact:</td><td><input type="text" name="contact"></td></tr>
<tr><td>Time:</td><td><input type="text" name="DateTime"></td></tr>
<tr><td></td><td><input type="submit" value="Submit"></td></tr>
</table>
<%
session.setAttribute("event", "true");%>
</form>
</div>
</body>
</html>