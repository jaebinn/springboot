package com.book.domain.posts;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity{

    @Id
    //MySQL을 사용할 땐 AUTO_INCREMENT
    @GeneratedValue(strategy = GenerationType.IDENTITY) //H2데이터베이스를 사용할 때 IDENTITY
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    //타입을 TEXT로 사용하고 NOT NULL
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
