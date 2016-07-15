package com.arpit.soap.server.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ApplicationCredentials", namespace = "https://aggarwalarpit.wordpress.com")
public class ApplicationCredentials {

	@XmlElement(name = "userId", required = true)
	private String userId;

	@XmlElement(name = "password", required = true)
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ApplicationCredentials [userId=" + userId + ", password="
				+ password + "]";
	}

}
