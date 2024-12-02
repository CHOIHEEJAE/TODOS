package com.chj.todos.service;

import com.chj.todos.mapper.UserMapper;
import com.chj.todos.model.users.UserDto;
import com.chj.todos.model.users.UserInfoResponse;
import com.chj.todos.model.users.UserRgstRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    private final UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class)
    public int insertUserInfo(UserRgstRequest request) {
        log.info("insertUserInfo ::: {}", request.toString());

        UserDto insertUserDto = UserDto.builder()
                .userName(request.getUserName())
                .password(passwordEncoder.encode(request.getPassword()))
                .email(request.getEmail())
                .build();

        return this.userMapper.insertUserInfo(insertUserDto);
    }

    @Transactional(readOnly = true)
    public List<UserInfoResponse> selectUserInfoList() {

        List<UserDto> response = this.userMapper.selectUserInfoList();

        log.info("selectUserInfoList ::: {}", response.toString());

        return response.stream().map(item -> UserInfoResponse.builder()
                .userId(item.getUserId())
                .userName(item.getUserName())
                .email(item.getEmail())
                .build()).collect(Collectors.toList());
    }
}
