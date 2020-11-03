package com.example.spring5webapp.repositories;

import com.example.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author weat0212@gmail.com
 * @project spring5webapp
 * @package com.example.spring5webapp.repositories
 * @date 2020/11/2 下午 01:39
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
