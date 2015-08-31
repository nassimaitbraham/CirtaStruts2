package com.aitech.action.login;

import com.opensymphony.xwork2.Action;

/**
 * Action appellee quand en appui sur le bouton login du formulaire de connexion
 * voir le fichier de configuration struts.xml <action name="login"
 * class="com.aitech.action.login.LoginAction">
 * 
 * @author Nasnet
 * 
 */
public class LoginAction implements Action {

	@Override
	public String execute() throws Exception {
		if ("nasnet".equals(getName()) && "nasnet".equals(getPwd())) {

			return "SUCCESS";
		} else{
			
			return "ERROR";
		}
	}

	/**
	 * Declaration des attributs correspondant au formulaire
	 */

	private String name;
	private String pwd;

	/**
	 * Getters et Setters des attribus du model
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
