package com.example.spring5webapp.repositories;

import com.example.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author weat0212@gmail.com
 * @project spring5webapp
 * @package com.example.spring5webapp.repositories
 * @date 2020/10/25 下午 05:17
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
