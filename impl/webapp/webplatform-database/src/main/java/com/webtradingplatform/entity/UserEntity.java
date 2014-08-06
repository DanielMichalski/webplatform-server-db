package com.webtradingplatform.entity;

import javax.persistence.*;

/**
 * Author: Daniel
 */
@Entity
@Table(name = "user_entity")
public class UserEntity {

    @Id
    @SequenceGenerator(name="user_userid_seq",
            sequenceName="user_userid_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="user_userid_seq")
    @Column(name = "user_id", updatable=false)
    private Integer id;

    @Column(name = "first_name" , length = 50,nullable = false)
    private String firstName;

    @Column(name = "last_name" , length = 50, nullable = false)
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
