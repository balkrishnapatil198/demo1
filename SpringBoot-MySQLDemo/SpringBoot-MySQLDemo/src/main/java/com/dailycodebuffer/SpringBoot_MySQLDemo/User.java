package com.dailycodebuffer.SpringBoot_MySQLDemo;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "tbl_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email_id")
    private String emailId;


    private Integer age;
}
