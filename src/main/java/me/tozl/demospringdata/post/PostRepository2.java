package me.tozl.demospringdata.post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository2 extends JpaRepository<Post2, Long>, PostCustomRepository<Post2> {
}
