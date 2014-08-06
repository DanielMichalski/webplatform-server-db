package com.webtradingplatform.service.user;

import com.webtradingplatform.dao.IUserDao;
import com.webtradingplatform.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Daniel
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public UserEntity registerNewUser(UserEntity user) {
        return userDao.registerNewUser(user);
    }

    @Override
    public void removeAllRegisteredUsers() {
        userDao.removeAllRegisteredUsers();
    }

    @Override
    public List<UserEntity> retrieveAllRegisteredUsers() {
        return userDao.retrieveAllRegisteredUsers();
    }

    @Override
    public void removeUser(UserEntity user) {
        userDao.removeUser(user);
    }

    @Override
    public UserEntity updateUserDetails(UserEntity user) {
        return userDao.updateUserDetails(user);
    }
}
