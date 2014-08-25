package com.webtradingplatform.service.user;

import com.webtradingplatform.entity.UserEntity;

/**
 * Author: Daniel
 */
public interface IUserService {

    UserEntity save(UserEntity user);

    void deleteAll();

    Iterable<UserEntity> findAll();

    void deleteUser(UserEntity user);
}