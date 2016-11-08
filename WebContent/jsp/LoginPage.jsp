<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'LoginPage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/LoginAndRegister.css">
  </head>
  
  <body>
    <!-- <div align="right">
	  	<a href="lang.action?request_locale=zh_CN" style="color: green; font-size: medium;">中文</a>
	  	<a href="lang.action?request_locale=en_US">English</a>
  	</div> -->
    <div align="center">
    	<s:form action="LoginAction" namespace="/LoginPackage">
    		<s:textfield name="UserName" key="UserNameKey"></s:textfield>
    		<s:textfield name="PassWord" key="PassWordKey"></s:textfield>
    		<s:submit name="Sub" key="SubKey" align="right"></s:submit>
    	</s:form>
    </div>
  </body>
</html>
