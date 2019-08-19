package cn.zx.tkmybatistest.mapper;

import cn.zx.mapper.MyMapper;
import cn.zx.tkmybatistest.entity.User;
import cn.zx.tkmybatistest.vo.UserGroupByName;

import java.util.List;

public interface UserMapper extends MyMapper<User> {

    List<UserGroupByName> selectGroupByName();

}