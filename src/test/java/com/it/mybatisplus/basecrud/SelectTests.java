package com.it.mybatisplus.basecrud;

import com.it.mybatisplus.entity.User;
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
 * 检索(Retrieve)操作
 */
@SpringBootTest
public class SelectTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectById() {
        User user = userMapper.selectById(1);
        System.out.println(user.toString());
    }

    @Test
    public void selectBatchIds() {
        //直接使用List
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<User> userList = userMapper.selectBatchIds(list);
        userList.forEach(user -> System.out.println("user对象" + user));

        //使用Stream流
        List<Integer> ids = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
        List<User> users = userMapper.selectBatchIds(ids);
        users.forEach(System.out::println);
    }

    /**
     * 按照条件检索数据
     */
    @Test
    public void selectByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Jone");
        map.put("age", 18);

        List<User> list = userMapper.selectByMap(map);
        System.out.println(list);
    }


}
