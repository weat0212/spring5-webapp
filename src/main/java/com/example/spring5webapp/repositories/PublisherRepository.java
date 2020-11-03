package com.example.spring5webapp.repositories;

import com.example.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author weat0212@gmail.com
 * @project spring5webapp
 * @package com.example.spring5webapp.repositories
 * @date 2020/11/3 下午 03:00
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
