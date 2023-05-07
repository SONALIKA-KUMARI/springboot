package com.api.book.bookrestapi.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.entities.book;
import com.api.fakeservices.bookservices;

@RestController
public class bookcontroller {


 bookservices books=new bookservices();
 @GetMapping("/books")
 public List<book> getBook()
    {  List<book> list=new ArrayList<>();
      list=  books.getAllBooks();
     return list;
          
    }
    @GetMapping("/books/{id}")
    public book getBYid(@PathVariable("id") int id)
    { book b=books.findById(id);
        return b;

    }
    
@PostMapping("/books")
 public String addbook(@RequestBody book b)
 {   books.addbook(b);
     return "it done";
     
 }
 @DeleteMapping("/books/{id}")
 public void deleteBook(@PathVariable("id") int id)
   {  books.deletebook(id);
    

   }

 }
    

