package com.chj.todos.model.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private long userId;

    private String userName;

    private String email;

    private String password;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    @Override
    public String toString() {
        return "userDto{" + "userId=" + userId + ", userName='" + userName + '\'' + ", email='" + email + '\''
                + ", password='" + password + '\'' + ", createDate=" + createDate + ", updateDate=" + updateDate + '}';
    }
}
