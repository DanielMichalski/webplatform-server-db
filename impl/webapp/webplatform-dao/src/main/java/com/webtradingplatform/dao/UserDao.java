package com.webtradingplatform.dao;

import com.webtradingplatform.entity.UserEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Author: Daniel
 */
@Repository
public class UserDao implements IUserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public UserEntity registerNewUser(UserEntity user) {
        UserEntity userMerged = entityManager.merge(user);
        entityManager.flush();
        return userMerged;
    }

    @Override
    @Transactional
    public UserEntity updateUserDetails(UserEntity user) {
        UserEntity userMerged = entityManager.merge(user);
        entityManager.flush();
        return userMerged;
    }

    @Override
    @Transactional
    public void removeAllRegisteredUsers() {
        Query query = entityManager.createQuery("delete from UserEntity");
        query.executeUpdate();
    }

    @Override
    @Transactional
    @SuppressWarnings("unchecked")
    public List<UserEntity> retrieveAllRegisteredUsers() {
        Query query = entityManager.createQuery("from UserEntity");
        List<UserEntity> allUsers = query.getResultList();
        return allUsers;
    }

    @Override
    @Transactional
    public void removeUser(UserEntity user) {
        entityManager.remove(user);
        entityManager.flush();
    }
}
