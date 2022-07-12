package com.librarymanagement.web.dao;

import org.springframework.data.repository.CrudRepository;

import com.librarymanagement.web.model.Books;

public interface BookRepository extends CrudRepository<Books, Integer>{

	public Books findById(int id);
	
}
