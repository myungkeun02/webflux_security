package org.myungkeun.webflux_crud.service;

import org.myungkeun.webflux_crud.entities.Blog;
import org.myungkeun.webflux_crud.payload.BlogDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface BlogService {
    Mono<Blog> createBlog(Mono<BlogDto> blogDto);

    Flux<Blog> getAllBlog();

    Mono<Blog> getBlogById(Long id);

    Mono<Blog> updateBlogById(Long id, Mono<BlogDto> blogDto);

    Mono<Blog> deleteBlogById(Long id);
}
