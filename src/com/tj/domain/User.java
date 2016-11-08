package com.tj.domain;

public class User {
private String UserName;
private String PassWord;
private String Name;
private int Id;

public User() {
	super();
	}

public User(String userName, String passWord, String name, int id) {
	super();
	UserName = userName;
	PassWord = passWord;
	Name = name;
	Id = id;
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

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

@Override
public String toString() {
	return "User [UserName=" + UserName + ", PassWord=" + PassWord + ", Name="
			+ Name + ", Id=" + Id + "]";
}


}
