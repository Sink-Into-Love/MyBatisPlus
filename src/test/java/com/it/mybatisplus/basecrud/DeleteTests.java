package com.it.mybatisplus.basecrud;

import com.it.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 删除(Delete)操作
 */
@SpringBootTest
public class DeleteTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void deleteById() {
        int rows = userMapper.deleteById(6);
        System.out.println("rows=" + rows);
    }

    /**
     * 按照条件删除数据
     */
    @Test
    public void deleteByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "靓仔皓");
        map.put("age", 18);

        int rows = userMapper.deleteByMap(map);
        System.out.println("rows=" + rows);
    }

    @Test
    public void deleteBatchIds() {
        //直接使用List
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        int rows1 = userMapper.deleteBatchIds(list);
        System.out.println("rows=" + rows1);

        //使用Stream流
        List<Integer> ids = Stream.of(3, 4, 5).collect(Collectors.toList());
        int rows2 = userMapper.deleteBatchIds(ids);
        System.out.println("rows=" + rows2);
    }
}
