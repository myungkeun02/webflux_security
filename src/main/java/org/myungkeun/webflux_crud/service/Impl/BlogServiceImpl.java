package org.myungkeun.webflux_crud.service.Impl;

import lombok.RequiredArgsConstructor;
import org.myungkeun.webflux_crud.entities.Blog;
import org.myungkeun.webflux_crud.payload.BlogDto;
import org.myungkeun.webflux_crud.repositories.BlogRepository;
import org.myungkeun.webflux_crud.service.BlogService;
import org.myungkeun.webflux_crud.utills.BlogUtils;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class BlogServiceImpl implements BlogService {
    private final BlogRepository blogRepository;
    @Override
    public Mono<Blog> createBlog(Mono<BlogDto> blogDto) {
        return blogDto.map(BlogUtils::toBlog).flatMap(blogRepository::save);
    }

    @Override
    public Flux<Blog> getAllBlog() {
        return null;
    }

    @Override
    public Mono<Blog> getBlogById(Long id) {
        return null;
    }

    @Override
    public Mono<Blog> updateBlogById(Long id, Mono<BlogDto> blogDto) {
        return null;
    }

    @Override
    public Mono<Blog> deleteBlogById(Long id) {
        return null;
    }
}
