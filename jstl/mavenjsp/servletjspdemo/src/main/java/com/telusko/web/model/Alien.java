package com.telusko.web.model;

public class Alien 
{
	private int userid;
	private String userName;
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Override
    public String toString() {
        return "Alien [userid=" + userid + ", userName=" + userName + "]";
    }
	
	
}