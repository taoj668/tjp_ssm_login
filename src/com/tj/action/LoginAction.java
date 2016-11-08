package com.tj.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.tj.dao.IUserDao;
import com.tj.domain.User;

public class LoginAction extends ActionSupport{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String UserName;
private String PassWord;
//private User user2;
private IUserDao UserDao;
public IUserDao getUserDao() {
	return UserDao;
}
public void setUserDao(IUserDao userDao) {
	UserDao = userDao;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassWord() {
	return PassWord;
}
public void setPassWord(String passWord) {
	PassWord = passWord;
}
/*public User getUser2() {
	return user2;
}
public void setUser2(User user2) {
	this.user2 = user2;
}*/

public String login1() throws Exception {
	Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);//LogManager.ROOT_LOGGER_NAME taoj_logger
		if(UserDao.Login(UserName, PassWord).equals("success")){
			logger.info("---------------login1登录成功--------------");
			return "success";
		}if(UserDao.Login(UserName, PassWord).equals("kong")){
			logger.info("---------------login1输入为空--------------");
			return "kong";
		}
		logger.info("---------------login1登录失败--------------");
		return "error";
	}

public String login2() throws Exception {
	Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	logger.info("---------------login2--------------");
		return "error";
	}
}
