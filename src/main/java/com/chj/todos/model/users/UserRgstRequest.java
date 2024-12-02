package com.chj.todos.model.users;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserRgstRequest {

    private String userName;

    private String email;

    private String password;

    @Override
    public String toString() {
        return "UserRgstRequest {" + "userName='" + userName + '\'' + ", email='" + email + '\'' + ", password='"
                + password + '\'' + '}';
    }
}
