package me.tozl.demospringdata.post;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)

/**
 * @DataJpaTest 는 slicing test 이다.
 *
 * 따라서 JPA 와 관련된 빈만 등록되기 때문에, Import 를 통해 Listener 를 빈으로 등록해야 한다.
 */
@DataJpaTest
@Import(PostRepository2Config.class)
public class PostRepository2Test {

    @Autowired
    PostRepository2 postRepository;

//    @Autowired
//    ApplicationContext applicationContext;
//
//    @Test
//    public void event() {
//        Post2 post2 = new Post2();
//        post2.setTitle("event");
//        PostPublishedEvent event = new PostPublishedEvent(post2);
//
//        applicationContext.publishEvent(event);
//    }

    @Test
    public void crud() {
        Post2 post2 = new Post2();
        post2.setTitle("hibernate");

        assertThat(postRepository.contains(post2)).isFalse();

        postRepository.save(post2.publish());

        assertThat(postRepository.contains(post2)).isTrue();

        postRepository.delete(post2);
        postRepository.flush();
    }
}