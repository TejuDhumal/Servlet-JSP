<%@ page import="static java.lang.System.out" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%--<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<%
//    int a = 9/0;
// try{
//     int a = 9/0;
// }
// catch (Exception e){
//     PrintWriter outt = response.getWriter();
//     outt.println("error" +e.getMessage());
// }
%>
<form action="HelloServlet">
    <input type="text" name="id">
    <input type="text" name="name">
    <input type="submit" name="submit" placeholder="submit">
</form>

<br/>

</body>
</html>