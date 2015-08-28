<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.vz.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="obj1" class="com.vz.Event"/>
<jsp:setProperty property="*" name="obj1"/>
<%
if (session.getAttribute("event").equals("true"))
{
	session.setAttribute("event", "false");
	int createStatus = createEvent.newEvent(obj1);
	if (createStatus==1)
		response.sendRedirect("events.jsp");
	else
		response.sendRedirect("addEvent.jsp");
}
else
{
	
}

%>
<body>
Loading...
</body>
</html>