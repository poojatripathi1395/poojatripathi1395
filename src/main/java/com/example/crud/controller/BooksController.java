package com.example.crud.controller;

import java.util.List;

import com.example.crud.model.Books;
import com.example.crud.service.BooksServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(allowCredentials = "false")
//mark class as Controller
//@RequestMapping(value = "api/v1")
@RestController
public class BooksController {
    //autowire the BooksService class
    @Autowired
    BooksServiceImp booksService;

    //creating a get mapping that retrieves all the books detail from the database
    @GetMapping("/book")
    private List<Books> getAllBooks() {

        return booksService.getAllBooks();
    }

    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/book/{bookid}")
    private Books getBooks(@PathVariable("bookid") int bookid) {

        return booksService.getBooksById(bookid);
    }

    //creating a delete mapping that deletes a specified book
    @DeleteMapping("/book/{bookid}")
    private void deleteBook(@PathVariable("bookid") int bookid) {

        booksService.delete(bookid);
    }

    //creating post mapping that post the book detail in the database
    @PostMapping("/book")
    private int saveBook(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books.getBookid();
    }

    //creating put mapping that updates the book detail
    @PutMapping("/book")
    private Books update(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books;
    }
}

