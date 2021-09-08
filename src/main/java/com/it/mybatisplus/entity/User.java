package com.it.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 133068166872292620L;

    /**
     * 主键ID
     * AUTO(0) 自动增长,    NONE(1) 没有主键,    INPUT(2) 手动输入,
     * ASSIGN_ID(3) 实体类用Long/String 表列属性使用bigint/varchar(50),   ASSIGN_UUID(4) 实体类用String 表列属性使用varchar(50),
     * Deprecated
     * ID_WORKER(3) 实体类用Long 表列属性使用bigint,   ID_WORKER_STR(3) 实体类用String 表列属性使用varchar(50),
     * UUID(4) 实体类用String 表列属性使用varchar(50),
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

