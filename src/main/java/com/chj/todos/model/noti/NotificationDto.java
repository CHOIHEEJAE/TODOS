package com.chj.todos.model.noti;

import java.time.LocalDateTime;

public class NotificationDto {

    private long notiId;

    private LocalDateTime notiDate;

    private String notiTitle;

    private LocalDateTime createdAt;

    @Override
    public String toString() {
        return "notificationDto{" + "notiId=" + notiId + ", notiDate=" + notiDate + ", notiTitle='" + notiTitle + '\''
                + ", createdAt=" + createdAt + '}';
    }
}
