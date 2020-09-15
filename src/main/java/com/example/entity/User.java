package com.example.entity;

import lombok.Data;

/**
 * @author wangH
 * @date 2020/9/2 16:45
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private String password;
}
