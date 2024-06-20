package com.spring.jwttoken.repository;

import com.spring.jwttoken.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findOneWithAuthoritiesByEmail(String email);
}
