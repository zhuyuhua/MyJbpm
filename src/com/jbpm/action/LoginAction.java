package com.jbpm.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * �����û���¼��action
 * 
 * @author Administrator
 * 
 */
public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String userName;

	public String login() {
		// ����ģ�ⲻͬ�Ľ�ɫ��½ϵͳ����ӵ���ͬ�Ĵ�������
		String manager = "admin,centre,xie";
		String boss = "god,oo,test,boss";
		String roleName = "";// Ҫ������ȥ���������ڵĽڵ�
		System.out.println(userName);

		if (userName==null) {
			return "login";
		}else if (manager.contains(userName)) {
			// �����½
			roleName = "manager";
		} else if (boss.contains(userName)) {
			// �ϰ��½
			roleName = "boss";
		} else {
			// ��ͨ�û�
			roleName = userName;
		}
		Map<String, Object> map = ActionContext.getContext().getSession();
		map.put("user", userName);
		map.put("role", roleName);
		return SUCCESS;
	}

	public String unlogin() {
		ActionContext.getContext().getSession().remove("user");
		return SUCCESS;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
