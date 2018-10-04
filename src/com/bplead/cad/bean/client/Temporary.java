package com.bplead.cad.bean.client;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import priv.lee.cad.model.ServerClientTemporary;
import priv.lee.cad.util.StringUtils;

@JacksonXmlRootElement(localName = "temporary")
public class Temporary implements ServerClientTemporary {

	private static final long serialVersionUID = 6958216530554295242L;
	private Preference preference;
	private boolean rememberMe;
	private String userName;
	private String userPasswd;

	public Temporary() {

	}

	public Temporary(String server, String userName, String userPasswd, boolean rememberMe) {
		this.userName = userName;
		this.userPasswd = userPasswd;
		this.rememberMe = rememberMe;
		this.preference = new Preference(null, null, server);
	}

	public Preference getPreference() {
		return preference;
	}

	@Override
	public String getServer() {
		return (preference == null || StringUtils.isEmpty(preference.getServer())) ? "" : preference.getServer();
	}

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public String getUserPasswd() {
		return userPasswd;
	}

	@Override
	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setPreference(Preference preference) {
		this.preference = preference;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Temporary [preference=");
		builder.append(preference);
		builder.append(", rememberMe=");
		builder.append(rememberMe);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", userPasswd=");
		builder.append(userPasswd);
		builder.append("]");
		return builder.toString();
	}
}
