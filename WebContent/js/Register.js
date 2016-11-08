function myCheck(){
	if(document.register.UserName.value==""){
		confirm("用户名不能为空！");
		return false;
	}if(document.register.PassWord.value==""){
		confirm("密码输入不能为空！");
		return false;
	}
}
