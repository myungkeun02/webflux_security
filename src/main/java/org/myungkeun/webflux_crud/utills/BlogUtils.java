package org.myungkeun.webflux_crud.utills;

import org.myungkeun.webflux_crud.entities.Blog;
import org.myungkeun.webflux_crud.payload.BlogDto;

public class BlogUtils {
    public static Blog toBlog(BlogDto blogDto) {
        return new Blog(blogDto.getTitle(), blogDto.getCategory(), blogDto.getDesc());
    }

    public static BlogDto toDto(Blog blog) {
        return new BlogDto(blog.getTitle(), blog.getCategory(), blog.getDesc());
    }
}
