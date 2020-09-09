package me.tozl.demospringdata.post;

import java.util.List;

public interface PostCustomRepository<T> {

    List<Post2> findMyPost();

    void delete(T entity);
}
