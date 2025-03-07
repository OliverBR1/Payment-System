package com.olivertech.payment_system.entity;

import jakarta.persistence.Id;

public class User {
    @Id
    private Long id;

    private String name;

    private String email;

    private String password;

    private String validateCode;

    private boolean enabled;

    public User(Long id, String name, String email, String password, String validateCode, boolean enabled) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.validateCode = validateCode;
        this.enabled = enabled;
    }

    public User() {

    }
}
