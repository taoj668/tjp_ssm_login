package com.tj.dao.impl;

import com.tj.dao.IUserDao;
import com.tj.domain.User;
import com.tj.iMapper.IUserMapper;

public class UserDaoImpl implements IUserDao{
private IUserMapper iUserMapper;

	public IUserMapper getiUserMapper() {
	return iUserMapper;
	}

	public void setiUserMapper(IUserMapper iUserMapper) {
	this.iUserMapper = iUserMapper;
	}

	@Override
	public String Login(String UserName, String PassWord) {
		String PassWordDB = iUserMapper.getPassWord(UserName);
		if(UserName.equals("")||PassWord.equals("")){
			return "kong";
		}if(PassWord.equals(PassWordDB)){
			return "success";
		}
		return "error";
	}

	@Override
	public String Register(String UserName, String PassWord, String Name) {
		//查询UserName是否已存在于数据库
		int UserId = iUserMapper.checkUserName(UserName);
		if( UserId != 0 ){
			return "exist";
		}else {
			int Id = iUserMapper.searchIdMax();  //查询当前最大idֵ
			iUserMapper.register(Id + 1 , UserName, PassWord, Name);
			return "success";
		}
		
	}

	@Override
	public String Search(String username) {
		User u = iUserMapper.search(username);
		if(u.equals(null)){
			return "no_result";
		}
		return u.toString();
	}

}
