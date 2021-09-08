package com.it.mybatisplus.activerecord;

import com.it.mybatisplus.entity.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 检索(Retrieve)操作
 */
@SpringBootTest
public class SelectTests {
    /**
     * 带id参数
     */
    @Test
    public void selectById1() {
        Dept dept = new Dept();
        Dept d = dept.selectById(2);
        System.out.println(d);
    }

    /**
     * 带id属性
     */
    @Test
    public void selectById2() {
        Dept dept = new Dept();
        dept.setId(2);
        Dept result = dept.selectById();
        System.out.println(result);
    }

    @Test
    public void selectAll() {
        Dept dept = new Dept();
        List<Dept> depts = dept.selectAll();
        System.out.println(depts);
    }


}
