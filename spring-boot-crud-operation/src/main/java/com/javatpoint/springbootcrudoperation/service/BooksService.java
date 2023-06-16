package com.javatpoint.springbootcrudoperation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.springbootcrudoperation.model.Books;
import com.javatpoint.springbootcrudoperation.repository.BooksRepository;

@Service
public class BooksService {
	
	@Autowired
	BooksRepository booksRepository;
	
	public List<Books> getAllBooks(){
		List<Books> books=new ArrayList<>();
		booksRepository.findAll().forEach(books1->books.add(books1));
		return books;
	}
	
	public Books getBooksbyId(int id)
	{
		return booksRepository.findById(id).get();
	}
	
	public void saveOrUpdate(Books books)
	{
		booksRepository.save(books);
	}
	
	public void delete(int id)
	{
		booksRepository.deleteById(id);
	}
	
	public void update(Books books, int bookid)
	{
		booksRepository.save(books);
	}
}
