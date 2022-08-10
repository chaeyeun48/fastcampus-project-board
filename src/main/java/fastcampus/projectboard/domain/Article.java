package fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class Article {
    // 게시글 테이블

    private Long id; // id
    private String title;  // 제목
    private String content;  // 내용
    private String hashtag; // 해시태그

    private LocalDateTime cratedAt; // 생성일시
    private String createdBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정자
}
