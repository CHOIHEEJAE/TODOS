package com.chj.todos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chj.todos.mapper")
public class TodosApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodosApplication.class, args);
    }

}
