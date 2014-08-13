package com.webtradingplatform.repository;

import com.webtradingplatform.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Author: Daniel
 */
public interface UserRepository extends CrudRepository<UserEntity, Long> {}
