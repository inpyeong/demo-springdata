package me.tozl.demospringdata;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CommentRepository extends MyRepository<Comment, Long> {

    /**
     * keyword 가 들어있는 모든 comment 를 찾아주는 쿼리를 Spring JPA 가 만듦.
     *
     * Strategy 1(Create): 메소드의 이름을 분석해서 직접 질의문 생성.
     * Strategy 2(Use-Declared-Query): 미리 정의가 되어 있는 질의문을 찾아서 사용.
     * Strategy 3(Create-If-Not-Found): 선언이 되어 있는 쿼리가 없는 경우 메소드 이름 분석해서 쿼리 생성하는..짬뽕?
     *
     * @param keyword
     * @return
     */
    List<Comment> findByCommentContains(String keyword);

    /**
     * 타입이 Page 가 아닌 List 이면 Page 에 대한 정보가 누락된다.
     * @param likeCount
     * @param post
     * @param pageable
     * @return
     */
    Page<Comment> findByLikeCountGreaterThanAndPost(int likeCount, Post post, Pageable pageable);
}
