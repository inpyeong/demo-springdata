package me.tozl.demospringdata;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Account {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    @Temporal(TemporalType.TIME)
    private Date created = new Date();

    private String yes;

    /**
     * 컬럼으로 매핑 안하는 어노테이션
     */
    @Transient
    private String no;

    /**
     * getter, setter  없어도 멤버들은 컬럼으로 맵핑된다.
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
