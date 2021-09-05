package com.it.mybatisplus.basecrud;

import com.it.mybatisplus.entity.User;
import com.it.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 增加(Create)操作
 */
@SpringBootTest
public class InsertTests {

    @Autowired
    private UserMapper userMapper;

    /**
     * 插入非空数据
     */
    @Test
    public void insert() {
        User user = new User();
        user.setName("靓仔皓");
        user.setAge(18);
        user.setEmail("2333@qq.com");

        int rows = userMapper.insert(user);
        //添加数据后 获取主键值
        Long id = user.getId();

        System.out.println("rows=" + rows + ", id='" + id);
    }
}
