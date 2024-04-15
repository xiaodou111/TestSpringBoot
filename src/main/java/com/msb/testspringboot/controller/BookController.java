package com.msb.testspringboot.controller;

import com.msb.testspringboot.entity.Book;
import com.msb.testspringboot.mapper.BookMapper;
import com.msb.testspringboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookMapper bookMapper;
    @GetMapping("/book")
    public String queryBook(){
        List<Book> book = bookMapper.findBook();
        System.out.println(book);
        return "book";
    }
}
