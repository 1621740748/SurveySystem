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
	private String userSex;//�Ա�
	private String userRole;//�û���ɫ��ע���û�������Ա��
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
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getUserPaperId() {
		return userPaperId;
	}
	public void setUserPaperId(String userPaperId) {
		this.userPaperId = userPaperId;
	}
}
