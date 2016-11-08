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
    
    <title>My JSP 'MainPage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/MainPage.css">
  </head>
  
  <body>
	<!-- <div id="backgroundPictrure">
		<img src="img/background.jpg"> 
	</div>与其它div浮动窗口冲突 -->
	
	<div id="welcome">欢迎访问本站</div>
	<div id="choose">
		<button onclick="window.location.href='jsp/LoginPage.jsp'">登录</button> &nbsp;&nbsp;
		<button onclick="window.location.href='jsp/RegisterPage.jsp'">注册</button>
	</div>
	<div id="introduction">
		<p id="title" align="center">本站简介</p><hr>
		<p id="text">&nbsp;&nbsp;谷歌公司（Google Inc.）成立于1998年9月4日，由拉里·佩奇和谢尔盖·布林共同创建，被公认为全球最大的搜索引擎。[1]<br> 
&nbsp;&nbsp;谷歌是一家位于美国的跨国科技企业，业务包括互联网搜索、云计算、广告技术等，同时开发并提供大量基于互联网的产品与服务，其主要利润来自于AdWords等广告服务。[2]<br> 
&nbsp;&nbsp;1999年下半年，谷歌网站“Google”正式启用。[3] <br>
&nbsp;&nbsp;2010年3月23日，谷歌宣布关闭在中国大陆市场搜索服务。[4]<br> 
&nbsp;&nbsp;2015年8月10日，谷歌宣布对企业架构进行调整，并创办了一家名为Alphabet的“伞形公司”（Umbrella Company），Google成为Alphabet旗下子公司。[5]<br> 
&nbsp;&nbsp;2015年度“世界品牌500强”排行中，谷歌重返榜首，苹果和亚马逊分别位居第二和第三名。[6] <br>
&nbsp;&nbsp;2015年11月4日，谷歌无人机业务主管沃斯透露，预计能在2017年推出无人机送货服务。[7] <br>
&nbsp;&nbsp;2016年6月8日，《2016年BrandZ全球最具价值品牌百强榜》公布，谷歌以2291.98亿美元的品牌价值重新超越苹果成为百强第一。[8]<br> 
		</p>
	</div>

  </body>
</html>
