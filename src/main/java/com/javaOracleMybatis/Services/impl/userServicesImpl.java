package com.javaOracleMybatis.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.javaOracleMybatis.Mappers.userMapper;
import com.javaOracleMybatis.Models.user;
import com.javaOracleMybatis.Services.userServices;

@Service
public class userServicesImpl implements userServices{
	@Autowired
	private userMapper mapper;
	
	@Override
	public List<user> getAllUser() {
		return mapper.getAllUser();
	};
	
	@Override
	public int userUpdate(user userUpdate) {
		if(userUpdate.getMaKh() <= 0 ) {
			// Create
			//System.out.println(">> "+ mapper.getNewIdUser());
			userUpdate.setMaKh(mapper.getNewIdUser()); // max userId + 1
			return mapper.userInsert(userUpdate);
		} 
			// Update 
		else {
			return mapper.userUpdate(userUpdate);
		}
	};
	
	@Override
	public user getUserById(int id) {
		// TODO Auto-generated method stub
		return mapper.getUserById(id);
	};
	
	@Override
	public List<user> getUserByRoleIdAndIsUse(int roleId, String isUse) {
		// TODO Auto-generated method stub
		return mapper.getUserByRoleIdAndIsUse(roleId, isUse);
	};
	
	@Override
	public int userDeleted(int userId) {
		// TODO Auto-generated method stub
		return mapper.userDeleted(userId);
	}
}
