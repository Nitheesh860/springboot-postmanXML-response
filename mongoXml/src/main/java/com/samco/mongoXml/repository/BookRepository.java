package com.samco.mongoXml.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samco.mongoXml.model.Books;


@Repository
public interface BookRepository extends MongoRepository<Books, Integer>{

}