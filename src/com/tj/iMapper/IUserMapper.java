package com.tj.iMapper;

import com.tj.domain.User;

public interface IUserMapper {
/**
 * 
 * @MethodName: getPassWord
 * @Description: 获取UserName对应的数据库密码
 * @param UserName
 * @return
 * String
 */
	public String getPassWord(String UserName); 

/**
 * 
 * @MethodName: checkUserName
 * @Description: 查询数据库中是否有相同的UserName
 * @param UserName
 * @return
 * int
 */
	public int checkUserName(String UserName);
	
/**
 * 
 * @MethodName: checkIdMax
 * @Description: 查询数据库中最大id值ֵ
 * @return
 * int
 */
	public int searchIdMax();
	
/**
 * 
 * @MethodName: register
 * @Description: 注册
 * @param UserName
 * @param PassWord
 * @param Name
 * @return
 * String
 */
	public void register(int Id ,String UserName,String PassWord,String Name);
	
/**
 * 
 * @MethodName: search
 * @Description: 搜索
 * @param username
 * @return
 * User
 */
	public User search(String username);
	
	
	
	
	
	
}
