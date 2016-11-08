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
    
    <title>注册界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/LoginAndRegister.css">
	<script type="text/javascript" src="js/Register.js"></script>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>
  </head>
  
  <body>
    
    <div id="registerForm" align="center">
    	<s:form action="/LoginPackage/RegisterAction" name="register" method="post" onsubmit="return myCheck()">
    		<s:textfield name="UserName" key="UserNameKey" ></s:textfield>
    		<s:textfield name="PassWord" key="PassWordKey"></s:textfield>
    		<s:textfield name="Name" key="NameKey"></s:textfield>
    		<s:submit name="Register" key="RegisterKey" align="right"></s:submit>
    	</s:form>
    </div>
  </body>
</html>
