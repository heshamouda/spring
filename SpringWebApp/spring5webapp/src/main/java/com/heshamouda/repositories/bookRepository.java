package com.heshamouda.repositories;

import org.springframework.data.repository.CrudRepository;
import com.heshamouda.domain.Book;

/**
 * Created by Hesham Ouda
 * at 24.10.2022
 */

public interface BookRepository extends CrudRepository<Book, Long> {

}
