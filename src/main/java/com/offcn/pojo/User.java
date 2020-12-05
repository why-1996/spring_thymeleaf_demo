package com.offcn.pojo;

import java.io.Serializable;

/**
 * @Author: 王海洋
 * @Date: 2020/12/4 17:27
 * @Description:
 */

public class User implements Serializable {
    private Long id;
    private String name;
    private Integer age;

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
}
