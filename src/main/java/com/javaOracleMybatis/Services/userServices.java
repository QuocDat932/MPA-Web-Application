package com.javaOracleMybatis.Services;

import java.util.List;

import com.javaOracleMybatis.Models.user;

public interface userServices { 
	List<user> getAllUser();
	int userUpdate(user userUpdate);
	List<user> getUserByRoleIdAndIsUse(int roleId, String isUse);
	user getUserById(int id);
	int userDeleted(int userId);
}
