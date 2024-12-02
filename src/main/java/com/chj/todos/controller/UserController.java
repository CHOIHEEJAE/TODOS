package com.chj.todos.controller;

import com.chj.todos.model.users.UserInfoResponse;
import com.chj.todos.model.users.UserRgstRequest;
import com.chj.todos.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public String mainPage() {
        log.info("mainPage init ::: ");
        return "hello world";
    }

    @PostMapping("/user/regist/post")
    public String userRegist(@RequestBody UserRgstRequest request) {

        int isSuccess = this.userService.insertUserInfo(request);

        return isSuccess > 0 ? "회원이 되신 것을 축하합니다." : "회원 등록에 실패하였습니다.";
    }

    @GetMapping("/user/list/get")
    public List<UserInfoResponse> userList() {
        return this.userService.selectUserInfoList();
    }
}
