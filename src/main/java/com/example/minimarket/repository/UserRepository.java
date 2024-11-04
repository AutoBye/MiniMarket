package com.example.minimarket.repository;

import com.example.minimarket.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /** 로그인 ID로 사용자 검색*/
    Optional<User> findByLoginId(String loginId);

    /** 이메일로 사용자 검색*/
    Optional<User> findByEmail(String email);

    /** 이메일 인증된 사용자 검색*/
    Optional<User> findByEmailAndEmailVerifiedTrue(String email);
}
