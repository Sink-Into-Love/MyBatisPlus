package com.it.mybatisplus.activerecord;

import com.it.mybatisplus.entity.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 增加(Create)操作
 */
@SpringBootTest
public class InsertTests {

    /**
     * 插入非空数据
     */
    @Test
    public void insert() {
        Dept dept = new Dept();
        dept.setName("后端部门");
        dept.setMobile("020-1111111");
        dept.setManager(1);

        boolean flag = dept.insert();

        System.out.println("flag=" + flag);
    }
}
