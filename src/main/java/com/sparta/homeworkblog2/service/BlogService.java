//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.sparta.homeworkblog2.service;


import java.util.List;

import com.sparta.homeworkblog2.dto.BlogRequestDto;
import com.sparta.homeworkblog2.dto.BlogResponseDto;
import com.sparta.homeworkblog2.entity.Blog;
import com.sparta.homeworkblog2.repository.BlogRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
@RequiredArgsConstructor
public class BlogService {
    private final BlogRepository blogRepository;

//    public BlogService(BlogRepository blogRepository) {
//        this.blogRepository = blogRepository;
//    }

    public BlogResponseDto createBlog(BlogRequestDto requestDto) {
        Blog blog = new Blog(requestDto);
        Blog saveBlog = blogRepository.save(blog);
        BlogResponseDto blogResponseDto = new BlogResponseDto(blog);
        return blogResponseDto;
    }

    public List<BlogResponseDto> getBlogs() {
        return blogRepository.findAllByOrderByModifiedAtDesc().stream().map(BlogResponseDto::new).toList();
    }
    public List<BlogResponseDto> getBlogsByKeyword(String keyword) {
        return blogRepository.findAllByContentsContainsOrderByModifiedAtDesc(keyword).stream().map(BlogResponseDto::new).toList();

    }

    @Transactional
    public Long updateBlog(Long id, BlogRequestDto requestDto) {
        Blog blog = findBlog(id);
        blog.update(requestDto);
        return id;
    }

    public Long deleteBlog(Long id) {
        Blog blog = findBlog(id);
        blogRepository.delete(blog);
        return id;
    }

    private Blog findBlog(Long id) {
        return blogRepository.findById(id).orElseThrow(() ->
            new IllegalArgumentException("선택한 메모는 존재하지 않습니다.")
        );
    }


}
