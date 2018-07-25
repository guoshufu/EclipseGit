package cn.itcast.mybatis.dao;

import  cn.itcast.mybatis.pojo.User;

public interface UserDao {

	//閫氳繃鐢ㄦ埛ID鏌ヨ涓�涓敤鎴�
	public User selectUserById(Integer id);
}
