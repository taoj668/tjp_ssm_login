<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'SearchMessage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
    <div id="searchInput">
    	<s:form action="/SearchPackage/SearchNameAction">
    		<s:textfield name="username"/>
    		<s:submit value="提交"/>
    	</s:form>
    </div>

   <!--  <div>
    	<form > 
    		<input id="name2"/>
    		<input type="submit" onclick="checkInput()" value="提交2"/>
    	</form>
    	
    	
    </div> -->
  </body>
</html>
