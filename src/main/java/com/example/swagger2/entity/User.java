package com.example.swagger2.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: zhaofq
 * @description: user
 * @create: 2018-09-05 09:21
 **/
@Getter
@Setter
@ToString
public class User {

    private int    id;
    private String email;
    private String idnumber;
    private int birthdate;
    private int  lastlogindate;
    private String loginname;
    private String mobile;
    private String name;
    private String passphrase;
    private int registerdate;
    private String salt;
    private String headpicurl;


}
