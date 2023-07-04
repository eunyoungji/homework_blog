//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.sparta.homeworkblog2.dto;

import com.sparta.homeworkblog2.entity.Blog;

import java.time.LocalDateTime;

public class BlogResponseDto {
    private Long id;
    private String title;
    private String name;
    private String contents;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String password;

    public BlogResponseDto(Blog blog) {
        this.title = blog.getTitle();
        this.name = blog.getName();
        this.contents = blog.getContents();
        this.createdAt = blog.getCreatedAt();
        this.modifiedAt = blog.getModifiedAt();
        this.password = blog.getPassword();
    }

}
