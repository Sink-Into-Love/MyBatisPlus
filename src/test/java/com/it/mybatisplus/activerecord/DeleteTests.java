package com.it.mybatisplus.activerecord;

import com.it.mybatisplus.entity.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 删除(Delete)操作
 */
@SpringBootTest
public class DeleteTests {

    /**
     * 带id参数
     */
    @Test
    public void deleteById1() {
        Dept dept = new Dept();
        boolean flag = dept.deleteById(1);
        System.out.println("flag=" + flag);
    }

    /**
     * 带id属性
     */
    @Test
    public void deleteById2() {
        Dept dept = new Dept();
        dept.setId(1);
        boolean flag = dept.deleteById();
        System.out.println("flag=" + flag);
    }
}
