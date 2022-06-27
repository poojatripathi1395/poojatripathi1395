package com.example.crud.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.crud.model.Books;
//repository that extends CrudRepository
public interface BookRepository extends CrudRepository<Books, Integer>
{
}