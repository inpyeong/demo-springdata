package me.tozl.demospringdata.post;

import org.springframework.context.ApplicationEvent;

public class PostPublishedEvent extends ApplicationEvent {

    private final Post2 post2;

    public PostPublishedEvent(Object source) {
        super(source);
        this.post2 = (Post2) source;
    }

    public Post2 getPost2() {
        return post2;
    }
}
