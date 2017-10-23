package com.cn21.account.model;

public class User {
    private Integer id;

    private Integer account;

    private String userName;

    private String mobile;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account=" + account +
                ", userName='" + userName + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }
}