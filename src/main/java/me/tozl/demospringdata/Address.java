package me.tozl.demospringdata;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    /**
     * Column 어노테이션 생략.
     */
    private String street;

    private String city;

    private String state;

    private String zipCode;
}
