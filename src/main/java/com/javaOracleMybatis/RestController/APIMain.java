package com.javaOracleMybatis.RestController;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaOracleMybatis.Models.user;
import com.javaOracleMybatis.Services.userServices;

@RestController
@RequestMapping("/api/user")
public class APIMain {
	@Autowired
	private userServices userServ;

	@GetMapping("/getAllUser")
	public ResponseEntity<?> doGetAllProd() throws SQLException{
		return ResponseEntity.ok(userServ.getAllUser());
	};
	
	@PostMapping("/postUpdateUser")
	public ResponseEntity<?> doPostUpdateUser(@RequestBody user user) {
		int effect = userServ.userUpdate(user);
		return ResponseEntity.ok(effect);
	};

	@GetMapping("/getUserById")
	public ResponseEntity<?> doGetUserById(@RequestParam("userId") int userId){
		System.out.println(">> userId = "+ userId);
		return ResponseEntity.ok(userServ.getUserById(userId));
	};
	
	@GetMapping("/getUserByRoleIdAndIsUse")
	public ResponseEntity<?> doGetUserByRoleIdAndIsUse(@RequestParam("roleId") int roleId,
													   @RequestParam("isUse") String isUse){
		return ResponseEntity.ok(userServ.getUserByRoleIdAndIsUse(roleId, isUse));
	};
	
	@GetMapping("/getDeletedById")
	public ResponseEntity<?> doGetDeltedById(@RequestParam("userId") int UserId){
		int effect = userServ.userDeleted(UserId);
		return ResponseEntity.ok(effect);
	}
	
}
