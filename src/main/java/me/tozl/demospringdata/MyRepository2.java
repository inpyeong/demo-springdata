package me.tozl.demospringdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface MyRepository2<T, ID extends Serializable> extends JpaRepository<T, ID> {

    boolean contains(T entity);
}
