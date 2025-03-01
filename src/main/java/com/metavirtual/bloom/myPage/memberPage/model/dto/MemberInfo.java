package com.metavirtual.bloom.myPage.memberPage.model.dto;

public class MemberInfo {
    private String name;
    private String userId;
    private String pwd;
    private String nickname;
    private String phone;
    private String gender;
    private String email;
    private String registDate;

    public MemberInfo() {
    }

    public MemberInfo(String name, String userId, String pwd, String nickname, String phone, String gender, String email, String registDate) {
        this.name = name;
        this.userId = userId;
        this.pwd = pwd;
        this.nickname = nickname;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
        this.registDate = registDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistDate() {
        return registDate;
    }

    public void setRegistDate(String registDate) {
        this.registDate = registDate;
    }

    @Override
    public String toString() {
        return "MemberInfo{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", pwd='" + pwd + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", registDate='" + registDate + '\'' +
                '}';
    }
}
