package com.tj.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tj.dao.IUserDao;

public class RegisterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String UserName;
	private String PassWord;
	private String Name;
	private IUserDao UserDao;
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
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public IUserDao getUserDao() {
		return UserDao;
	}
	public void setUserDao(IUserDao userDao) {
		UserDao = userDao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String execute() throws Exception {
		if(UserDao.Register(UserName, PassWord, Name).equals("success")){
			return "success";
		}else if(UserDao.Register(UserName, PassWord, Name).equals("exist")){
			return "exist";
		}
		return "error";
	}
	
	
}
