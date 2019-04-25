package com.example.security.service;

import com.example.security.entity.Book;
import com.example.security.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 程江涛 on 2019/4/24.
 */

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAllBook() {
        return  bookRepository.findAll();
    }
}
