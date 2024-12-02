package com.chj.todos.mapper;

import com.chj.todos.model.users.UserDto;

import java.util.List;

public interface UserMapper {

    int insertUserInfo(UserDto userDto);

    List<UserDto> selectUserInfoList();

}
