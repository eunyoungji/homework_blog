//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.sparta.homeworkblog2.entity;
import com.sparta.homeworkblog2.dto.BlogRequestDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "blog")
@NoArgsConstructor
public class Blog extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",
            nullable = false)
    private String name;

    @Column(name = "contents",
            nullable = false,
            length = 500)
    private String contents;

    @Column(name = "title",
            nullable = false,
            length = 500)
    private String title;

    @Column(name = "password",
            nullable = false,
            length = 100)
    private String password;


    public Blog(BlogRequestDto requestDto) {
        this.name = requestDto.getName();
        this.contents = requestDto.getContents();
        this.title = requestDto.getTitle();
        this.password = requestDto.getPassword();
    }

    public void update(BlogRequestDto requestDto) {
        this.name = requestDto.getName();
        this.contents = requestDto.getContents();
        this.title = requestDto.getTitle();
        this.password = requestDto.getPassword();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getContents() {
        return this.contents;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPassword() {
        return this.password;
    }

}


