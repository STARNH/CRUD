package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role 
{
	@Id
	private int rid;
	private String role_name;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	
	

}
