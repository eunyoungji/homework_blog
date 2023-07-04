//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.sparta.homeworkblog2.dto;

import java.time.LocalDateTime;

public class BlogRequestDto {
    private String title;
    private String name;
    private String contents;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String password;

    public BlogRequestDto() {
    }

    public String getTitle() {
        return this.title;
    }

    public String getName() {
        return this.name;
    }

    public String getContents() {
        return this.contents;
    }

    public LocalDateTime getCreatedAt() { return this.createdAt; }

    public LocalDateTime getModifiedAt() { return this.modifiedAt; }

    public String getPassword() {
        return this.password;
    }
}
