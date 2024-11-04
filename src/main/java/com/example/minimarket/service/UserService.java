package com.example.minimarket.service;

import com.example.minimarket.model.User;
import com.example.minimarket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /** 모든 사용자 목록 가져오기 */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /** ID로 사용자 조회하기 */
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    /** 새로운 사용자 추가하기 */
    public User addUser(User user) {
        return userRepository.save(user);
    }

    /** 사용자 업데이트하기 */
    public User updateUser(Long id, User userDetails) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setUsername(userDetails.getUsername());
            user.setEmail(userDetails.getEmail());
            return userRepository.save(user);
        } else {
            throw new RuntimeException("해당 아이디에 맞는 유저를 찾을 수 없습니다. id :" + id);
        }
    }

    //** 사용자 삭제하기 */
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
