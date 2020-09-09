package me.tozl.demospringdata;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        /**
         * entity 객체 모델 기준으로 작성한다.
         *
         * 아래는 JSQL 사용 방법 예이다.
         *
         * type-safe query 가 아닌 것이 단점이다.
         */
//        TypedQuery<Post> query = entityManager.createQuery("SELECT p from Post AS p", Post.class);
//        List<Post> posts = query.getResultList();
//        posts.forEach(System.out::println);

        /**
         * JSQL 이면서 type-safe query 를 사용하는 법.
         *
         * sql 로 변환되서 실행된다.
         */
//        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Post> query = builder.createQuery(Post.class);
//        Root<Post> root = query.from(Post.class);
//        query.select(root);
//
//        List<Post> posts = entityManager.createQuery(query).getResultList();
//        posts.forEach(System.out::println);


        /**
         * 실제 쿼리문 사용법.
         */
//        List<Post> posts = entityManager.createNativeQuery("SELECT * FROM Post", Post.class).getResultList();
//        posts.forEach(System.out::println);
    }
}
