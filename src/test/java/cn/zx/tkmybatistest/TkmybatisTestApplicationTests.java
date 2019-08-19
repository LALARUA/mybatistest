package cn.zx.tkmybatistest;

import cn.zx.tkmybatistest.entity.User;
import cn.zx.tkmybatistest.mapper.UserMapper;
import cn.zx.tkmybatistest.vo.UserGroupByName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TkmybatisTestApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        List<UserGroupByName> userGroupByNames = userMapper.selectGroupByName();
        System.out.println();
    }

}
