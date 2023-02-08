package com.javaOracleMybatis.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class user {
	private int maKh;
	private String tenKh;
	private String diaChi;
	private String mail;
	private String phone;
	private String img;
	private String birthday;
	private String isUse;
	private String roleId;
	private String roleName;
	
	private String LaiDepTrai;
	private String VyKhung;
}
