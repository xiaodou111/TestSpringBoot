package com.msb.testspringboot.mapper;

import com.msb.testspringboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from d_user_test1")
    public List<User> findAll();
    public User findById(Integer id);
    public int insert(User user);
    public int update(User user);
    public int delete(Integer id);
}
