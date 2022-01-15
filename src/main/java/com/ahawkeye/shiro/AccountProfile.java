package com.ahawkeye.shiro;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountProfile implements Serializable {

    private static final long serialVersionUID = 10L;

    private Long id;

    private String username;

    private String avatar;

    private String email;

}
