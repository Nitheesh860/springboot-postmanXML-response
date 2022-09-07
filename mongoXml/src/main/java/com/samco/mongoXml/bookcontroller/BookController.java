package com.samco.mongoXml.bookcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samco.mongoXml.model.Books;
import com.samco.mongoXml.service.BookService;




@RestController
public class BookController {

	
	@Autowired
	private BookService service;
	
	@PostMapping(value = "/addBooks", produces = MediaType.APPLICATION_XML_VALUE)
	public Books saveBook(@RequestBody Books books) {
		return service.saveBook(books);

		
	}

	@GetMapping(value = "/findAllBooks", produces=MediaType.APPLICATION_XML_VALUE)
	public List<Books> getBooks() {

		return service.getBooks();
	}

	@DeleteMapping(value = "/delete/{id}", produces=MediaType.APPLICATION_XML_VALUE)
	public String deleteBook(@PathVariable Integer id) {
		service.deleteBook(id);

		return "Deleted Successfully";
	}
}