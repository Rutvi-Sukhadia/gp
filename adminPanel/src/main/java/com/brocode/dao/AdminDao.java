package com.brocode.dao;

import java.util.List;

import com.brocode.model.Admin;

public interface AdminDao extends GenericDAO<Admin> {

	public Admin loginCheck(Admin admin);
	
	int emailCheck(Admin admin);
	
	public List<Admin> getActive();
	
	public Admin saveupdateAdmin(Admin admin);
	
	void updatepassword(Admin admin);

	Admin changepassword(Admin admin);

	Admin forgotpassword(Admin admin);
}
