package com.jgm.projectboard.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id;
    private String title; // 제목
    private String content; // 내용
    private String hashtag; // 해시태크

    private LocalDateTime createAt; // 생성 날짜
    private String createBy; // 생성자
    private LocalDateTime modifiedAt; // 수정 날짜
    private String modifiedBy; // 수정자
}
