package com.ccx.springbootMybatisProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccx.springbootMybatisProject.entity.User;
import com.ccx.springbootMybatisProject.mapper.UserMapper;

@Service
public class UserService {
   @Autowired
   private UserMapper userMapper;
   
   
   public User checkLogin(User user){
	   return userMapper.checkLogin(user.getUserName(), user.getPassword());
   }
   public boolean registerUser(User user){
	   return userMapper.insertSelective(user)!=0;
   }
   public User selectByPrimaryKey(String name){
	   return userMapper.selectByPrimaryKey(name);
   }
}
