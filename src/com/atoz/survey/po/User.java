package com.atoz.survey.po;
/**
 * JavaBean��User
 * 
 * @author SingleX
 *
 */
public class User {
	private int userId;//ID��
	private String userName;//�û���
	private String userPassword;//�û�����
	private String userIcon;//�û�ͷ��
	private String userMail;//����
	private String userReg;//ע������
	private int userSex;//�Ա�    0-δ֪,1-��,2-Ů
	private int userRole;//�û���ɫ    0-����Ա,1-ע���û�
	private String userPaperId;//�û��ʾ��
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserIcon() {
		return userIcon;
	}
	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getUserReg() {
		return userReg;
	}
	public void setUserReg(String userReg) {
		this.userReg = userReg;
	}
	public int getUserSex() {
		return userSex;
	}
	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}
	public int getUserRole() {
		return userRole;
	}
	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}
	public String getUserPaperId() {
		return userPaperId;
	}
	public void setUserPaperId(String userPaperId) {
		this.userPaperId = userPaperId;
	}
}
