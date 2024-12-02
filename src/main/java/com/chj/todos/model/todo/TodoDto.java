package com.chj.todos.model.todo;

import java.time.LocalDateTime;

public class TodoDto {

    private long todoId;

    private long userId;

    private String title;

    private String description;

    private String completed;

    private LocalDateTime dueDate;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private long categoryId;

    @Override
    public String toString() {
        return "todoDto{" + "todoId=" + todoId + ", userId=" + userId + ", title='" + title + '\'' + ", description='"
                + description + '\'' + ", completed='" + completed + '\'' + ", dueDate=" + dueDate + ", createdAt="
                + createdAt + ", updatedAt=" + updatedAt + ", categoryId=" + categoryId + '}';
    }
}
