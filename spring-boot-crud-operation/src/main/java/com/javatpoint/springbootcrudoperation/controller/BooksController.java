package com.javatpoint.springbootcrudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.springbootcrudoperation.model.Books;
import com.javatpoint.springbootcrudoperation.service.BooksService;

@RestController
public class BooksController {
	
	@Autowired
	BooksService bookService;
	
	@GetMapping("/book")
	private List<Books> getAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	@GetMapping("/book/{bookid}")
	private Books getBooks(@PathVariable("bookid") int bookid)
	{
		return bookService.getBooksbyId(bookid);
	}
	
	@DeleteMapping("/book/{bookid}")
	private void deleteBook(@PathVariable("bookid") int bookid)
	{
		bookService.delete(bookid);
	}
	
	@PostMapping("/books")
	private int saveBook(@RequestBody Books books)
	{
		bookService.saveOrUpdate(books);
		return books.getBookid();
	}
	
	@PutMapping("/books")
	private Books update(@RequestBody Books books)
	{
		bookService.saveOrUpdate(books);
		return books;
	}

	
	
}
