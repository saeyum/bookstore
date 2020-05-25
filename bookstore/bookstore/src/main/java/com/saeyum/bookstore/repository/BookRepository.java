package com.saeyum.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saeyum.bookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long> {
	

}
