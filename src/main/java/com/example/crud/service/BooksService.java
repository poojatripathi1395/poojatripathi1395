package com.example.crud.service;

import com.example.crud.model.Books;

import java.util.List;

public interface BooksService {
    public List<Books> getAllBooks();
    public Books getBooksById(int id);
    public void saveOrUpdate(Books books);
    public void delete(int id);
    public void update(Books books, int bookid);

}
