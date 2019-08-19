package cn.zx.tkmybatistest.vo;

import cn.zx.tkmybatistest.entity.User;

import java.util.List;

public class UserGroupByName {
    private String name;
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
