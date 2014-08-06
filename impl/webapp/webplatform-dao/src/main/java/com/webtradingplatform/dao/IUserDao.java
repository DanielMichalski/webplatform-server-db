package com.webtradingplatform.dao;

import com.webtradingplatform.entity.UserEntity;

import java.util.List;

/**
 * Author: Daniel
 */
public interface IUserDao {
    public UserEntity registerNewUser(UserEntity user);

    public void removeAllRegisteredUsers();

    public List<UserEntity> retrieveAllRegisteredUsers();

    public void removeUser(UserEntity user);

    public UserEntity updateUserDetails(UserEntity user);

}
