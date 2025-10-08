package com.example.mapper_springboot.service;

import com.example.mapper_springboot.dto.UserDTO;
import com.example.mapper_springboot.entity.User;
import com.example.mapper_springboot.mapper.UserMapper;
import com.example.mapper_springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public User saveUser(UserDTO userDTO){
        return userRepository.save(userMapper.toEntity(userDTO));
    }

    public UserDTO getUserById(Long id){
        return userMapper.toDTO(userRepository.findById(id).orElse(null));
    }

    public List<UserDTO> getUsers(){
        return userMapper.toDTOList(userRepository.findAll());
    }
}
