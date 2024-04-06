package org.myungkeun.webflux_crud.repositories;

import org.myungkeun.webflux_crud.entities.Blog;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BlogRepository extends ReactiveCrudRepository<Blog, Long> {
}
