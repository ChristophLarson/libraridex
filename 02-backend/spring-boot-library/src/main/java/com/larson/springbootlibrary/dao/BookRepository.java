package com.larson.springbootlibrary.dao;

import com.larson.springbootlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BookRepository extends JpaRepository<Book, Long> {

}
