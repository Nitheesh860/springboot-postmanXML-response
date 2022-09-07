package com.samco.mongoXml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.samco.mongoXml.model.Books;
import com.samco.mongoXml.repository.BookRepository;


@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public Books saveBook(@RequestBody Books books) {
		return bookRepository.save(books);

		
	}

	@GetMapping("/findAllBooks")
	public List<Books> getBooks() {

		return bookRepository.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable Integer id) {
		bookRepository.deleteById(id);

		return "Deleted Successfully";
	}

}
