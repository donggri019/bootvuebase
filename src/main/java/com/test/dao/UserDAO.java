package com.test.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.test.dto.UserDTO;

public interface UserDAO {
	public abstract List<UserDTO> userList(SqlSessionTemplate session);
}