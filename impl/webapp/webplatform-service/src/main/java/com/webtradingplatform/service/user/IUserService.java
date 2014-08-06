package com.webtradingplatform.service.user;

import com.webtradingplatform.entity.UserEntity;

import java.util.List;

/**
 * Author: Daniel
 */
public interface IUserService {

    public UserEntity registerNewUser(UserEntity user);

    public void removeAllRegisteredUsers();

    public List<UserEntity> retrieveAllRegisteredUsers();

    public void removeUser(UserEntity user);

    public UserEntity updateUserDetails(UserEntity user);
}