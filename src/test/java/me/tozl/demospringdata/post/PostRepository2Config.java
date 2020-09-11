package me.tozl.demospringdata.post;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostRepository2Config {

    @Bean
    public PostListener postListener() {
        return new PostListener();
    }
}
