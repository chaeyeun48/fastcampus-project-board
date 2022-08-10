package fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    // 댓글 테이블

    private Long id; // id
    private Article article_id;  // 게시글id(fk)
    private String content; // 내용

    private LocalDateTime cratedAt; // 생성일시
    private String createdBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정자
}
