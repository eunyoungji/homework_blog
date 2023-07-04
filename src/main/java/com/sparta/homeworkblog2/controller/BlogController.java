//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.sparta.homeworkblog2.controller;


import com.sparta.homeworkblog2.dto.BlogRequestDto;
import com.sparta.homeworkblog2.dto.BlogResponseDto;
import com.sparta.homeworkblog2.entity.Blog;
import com.sparta.homeworkblog2.repository.BlogRepository;
import com.sparta.homeworkblog2.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping({"/api"})
public class BlogController {
    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @PostMapping({"/blogs"})
    public BlogResponseDto createBlog(@RequestBody BlogRequestDto requestDto) {
        return this.blogService.createBlog(requestDto);
    }

    @GetMapping({"/blogs"})
    public List<BlogResponseDto> getBlogs() {
        return blogService.getBlogs();
    }

    @GetMapping("/blogs/contents")
    public List<BlogResponseDto> getBlogsByKeyword(String keyword) {
        return blogService.getBlogsByKeyword(keyword);
    }

    @PutMapping({"/blogs/{id}"})
    public Long updateBlog(@PathVariable Long id, @RequestBody BlogRequestDto requestDto) {
        return this.blogService.updateBlog(id, requestDto);
    }

    @DeleteMapping({"/blogs/{id}"})
    public Long deleteblog(@PathVariable Long id) {
        return this.blogService.deleteBlog(id);
    }
}



