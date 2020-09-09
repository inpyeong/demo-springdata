package me.tozl.demospringdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

}

//@Repository
//@Transactional
//public class PostRepository {
//
//    /**
//     * Spring 코드를 최대한 숨길 수 있다.
//     *
//     * non-invasive feature
//     */
//    @PersistenceContext
//    EntityManager entityManager;
//
//    public Post add(Post post) {
//        entityManager.persist(post);
//        return post;
//    }
//
//    public void delete(Post post) {
//        entityManager.remove(post);
//    }
//
//    public List<Post> findAll() {
//        return entityManager.createQuery("SELECT p FROM Post AS p", Post.class).getResultList();
//    }
//}
