package com.tj.dao;

public interface IUserDao {
/**
 * 
 * @MethodName: Login
 * @Description: 登录
 * @param UserName
 * @param PassWord
 * @return
 * String
 */
public String Login(String UserName,String PassWord);

/**
 * 
 * @MethodName: Register
 * @Description: 注册
 * @param UserName
 * @param PassWord
 * @param Name
 * @return
 * String
 */
public String Register(String UserName,String PassWord,String Name);

/**
 * 
 * @MethodName: Search
 * @Description: 搜索
 * @param username
 * @return
 * String
 */
public String Search(String username);

}













