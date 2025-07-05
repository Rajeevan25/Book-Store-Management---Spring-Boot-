package com.bookstore.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    @GetMapping("/")
    public String home() {
        return "home"; 
    }
    @GetMapping("/book_register")
    public String bookRegister() {
        return "book_register"; 
    }
    @GetMapping("/bookList")
    public String getAllBooks() {    
        return "bookList"; 
    }       
    @GetMapping("/myBooks")
    public String myBooks() {
        return "myBooks";          
    }

}
