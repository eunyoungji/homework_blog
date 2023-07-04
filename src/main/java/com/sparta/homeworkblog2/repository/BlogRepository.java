//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.sparta.homeworkblog2.repository;

import java.util.List;

import com.sparta.homeworkblog2.entity.Blog;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.sql.Date;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {
    List<Blog> findAllByOrderByModifiedAtDesc();
    List<Blog> findAllByContentsContainsOrderByModifiedAtDesc(String keyword);
}


