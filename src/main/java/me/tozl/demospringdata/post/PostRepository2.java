package me.tozl.demospringdata.post;

import me.tozl.demospringdata.MyRepository2;
import me.tozl.demospringdata.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository2 extends MyRepository2<Post2, Long> {
}
