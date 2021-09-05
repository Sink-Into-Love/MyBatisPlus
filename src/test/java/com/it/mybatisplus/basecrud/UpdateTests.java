package com.it.mybatisplus.basecrud;

import com.it.mybatisplus.entity.User;
import com.it.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 更新(Update)操作
 */
@SpringBootTest
public class UpdateTests {

    @Autowired
    private UserMapper userMapper;

    /**
     * 更新非空属性值
     * 实体类属性要定义成包装类型 可以判断是否为空
     */
    @Test
    public void updateById() {
        User user = new User();
        user.setId(6L);
//        user.setName("programmer皓");
        user.setAge(16);
//        user.setEmail("13812345678@139.com");

        int rows = userMapper.updateById(user);
        System.out.println("rows=" + rows);
    }
}
