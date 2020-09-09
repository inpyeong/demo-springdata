package me.tozl.demospringdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CommentRepositoryTest {

    @Autowired
    CommentRepository commentRepository;

    @Test
    public void crud() {

        // Given
        createComment(100, "spring data jpa");
        createComment(55, "HIBERNATE SPRING");
        PageRequest pageRequest = PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "LikeCount"));

        // When
//        Page<Comment> comments = commentRepository.findByCommentContainsIgnoreCase("spring", pageRequest);
        try(Stream<Comment> comments = commentRepository.findByCommentContainsIgnoreCase("spring", pageRequest)) {
            Comment firstComment = comments.findFirst().get();
            assertThat(firstComment.getLikeCount()).isEqualTo(100);
        }

        // Then
//        assertThat(comments.getNumberOfElements()).isEqualTo(2);
//        assertThat(comments).first().hasFieldOrPropertyWithValue("LikeCount", 100);

    }

    private void createComment(int likeCount, String comment) {
        Comment newComment = new Comment();
        newComment.setComment(comment);
        newComment.setLikeCount(likeCount);
        commentRepository.save(newComment);
    }

}