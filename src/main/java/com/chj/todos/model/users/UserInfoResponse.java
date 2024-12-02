package com.chj.todos.model.users;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserInfoResponse {

    private long userId;

    private String userName;

    private String email;

    @Override
    public String toString() {
        return "UserInfoResponse{" + "userId='" + userId + '\'' + ", userName='" + userName + '\'' + ", email='" + email
                + '\'' + '}';
    }
}
