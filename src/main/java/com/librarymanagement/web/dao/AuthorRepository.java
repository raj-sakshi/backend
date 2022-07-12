package com.librarymanagement.web.dao;
import org.springframework.data.repository.CrudRepository;

import com.librarymanagement.web.model.Authors;

public interface AuthorRepository extends CrudRepository<Authors, Integer> {

	public Authors findById(int id);

}
