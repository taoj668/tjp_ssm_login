package com.tj.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tj.dao.IUserDao;

public class SearchNameAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private IUserDao UserDao;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public IUserDao getUserDao() {
		return UserDao;
	}
	public void setUserDao(IUserDao userDao) {
		UserDao = userDao;
	}
	@Override
	public String execute() throws Exception {
		String result = UserDao.Search(username);
		ActionContext ac = ActionContext.getContext();
		Map<String,Object> session = ac.getSession();
		session.put("result", result);
		return "success";
	}
}
