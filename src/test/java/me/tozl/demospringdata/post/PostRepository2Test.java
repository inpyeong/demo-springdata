package me.tozl.demospringdata.post;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PostRepository2Test {

    @Autowired
    PostRepository2 postRepository;

    @Test
    public void crud() {
        Post2 post2 = new Post2();
        post2.setTitle("hibernate");
        postRepository.save(post2);

        postRepository.findMyPost();

        postRepository.delete(post2);
        postRepository.flush();
    }
}