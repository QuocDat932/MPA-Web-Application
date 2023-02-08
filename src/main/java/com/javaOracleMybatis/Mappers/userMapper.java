package com.javaOracleMybatis.Mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.javaOracleMybatis.Models.user;

@Mapper
public interface userMapper {
	List<user> getAllUser();
	user getUserById(int Id);
	List<user> getUserByRoleIdAndIsUse(@Param("roleId")int roleId,@Param("isUse") String isUse);
	int userUpdate(user userUpdate);
	int userInsert(user userInsert);
	int getNewIdUser();
	int userDeleted(int userId);
}
