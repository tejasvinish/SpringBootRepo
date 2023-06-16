package com.javatpoint.springbootcrudoperation.repository;

import org.springframework.data.repository.CrudRepository;

import com.javatpoint.springbootcrudoperation.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer>{

}
