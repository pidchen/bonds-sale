package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ssm.mapper.UserMapper;
import com.ssm.model.User;

public interface UserDao extends UserMapper {
	User findUserById(Integer id);

	@Select("SELECT id,username,userage FROM user")
	List<User> findAll();

	/**
	 * 用户数据新增
	 */
	@Insert("insert into user(id,username,userage) values (#{id},#{username},#{userage})")
	void addUser(User user);

	/**
	 * 用户数据修改
	 */
	@Update("update user set username=#{username},userage=#{userage} where id=#{id}")
	void updateUser(User user);

	/**
	 * 用户数据删除
	 */
	@Delete("delete from user where id=#{id}")
	void deleteUser(int id);

	/**
	 * 根据用户名称查询用户信息
	 *
	 */
	@Select("SELECT id,username,userage FROM user where name=#{userName}")
	User findByName(@Param("userName") String userName);

}
