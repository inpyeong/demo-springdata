package me.tozl.demospringdata;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.stream.Stream;

public interface CommentRepository extends MyRepository<Comment, Long> {

//    Page<Comment> findByCommentContainsIgnoreCase(String keyword, Pageable pageable );
    Stream<Comment> findByCommentContainsIgnoreCase(String keyword, Pageable pageable );
}
