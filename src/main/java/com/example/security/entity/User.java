package com.example.security.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by 程江涛 on 2019/4/13.
 */
@Entity
@Table(name = "user")
public class User extends BaseEntity{

    @Column(nullable = false, length = 20)
    private String username;

    @Column(nullable = false)
    private String password;

    private String email;

    @Column(nullable = false)
    private String mobile;

    /**
     * 多对多 用户 -> 角色 中间表
     */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<Role> roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
