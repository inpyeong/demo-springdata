package me.tozl.demospringdata.post;

import org.springframework.context.ApplicationListener;

public class PostListener implements ApplicationListener<PostPublishedEvent> {
    @Override
    public void onApplicationEvent(PostPublishedEvent event) {
        System.out.println("------------------");
        System.out.println(event.getPost2().getTitle() + " is published!!!");
        System.out.println("------------------");
    }
}
