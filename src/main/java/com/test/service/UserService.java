package com.test.service;

import java.util.List;

import com.test.dto.UserDTO;

public interface UserService {
	public abstract List<UserDTO> userList();

}