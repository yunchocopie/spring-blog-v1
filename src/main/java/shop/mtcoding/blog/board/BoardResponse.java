package shop.mtcoding.blog.board;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

public class BoardResponse {
    // bt.id, bt.content, bt.title, bt.created_at, bt.user_id, ut.username
    @Data
    @AllArgsConstructor
    public static class DetailDTO {
        private Integer id;
        private String title;
        private String content;
        private Timestamp createdAt; // 순서 마지막에서 올려줌
        private Integer userId;
        private String username;

    }
}
