package com.webtradingplatform.service.user;

import com.webtradingplatform.entity.UserEntity;
import com.webtradingplatform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Author: Daniel
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public UserEntity save(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteAll() {
        userRepository.deleteAll();
    }

    @Override
    @Transactional
    public Iterable<UserEntity> findAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public void deleteUser(UserEntity user) {
        userRepository.delete(user);
    }
}
