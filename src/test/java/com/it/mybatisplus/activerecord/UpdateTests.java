package com.it.mybatisplus.activerecord;

import com.it.mybatisplus.entity.Dept;
import com.it.mybatisplus.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 更新(Update)操作
 */
@SpringBootTest
public class UpdateTests {

    /**
     * 更新非空属性值
     */
    @Test
    public void updateById() {
        Dept dept = new Dept();
        dept.setId(1);
        dept.setName("前端部门");
        dept.setMobile("020-2222222");
        dept.setManager(2);

        boolean flag = dept.updateById();

        System.out.println("flag=" + flag);
    }
}
