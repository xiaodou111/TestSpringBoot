package com.msb.testspringboot.mapper;

import com.msb.testspringboot.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface BookMapper {
    @Select("select * from t_book")
    public List<Book> findBook();
}
