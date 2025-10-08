package com.example.mapper_springboot.mapper;

import com.example.mapper_springboot.dto.UserDTO;
import com.example.mapper_springboot.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "emailId", target = "email")
    @Mapping(source = "contactNo", target = "phoneNo")
    User toEntity(UserDTO userDTO);

    @Mapping(source = "email", target = "emailId")
    @Mapping(source = "phoneNo", target = "contactNo")
    UserDTO toDTO(User user);

//    For the List of UserDTO and List of User we don't have to map.
    List<UserDTO> toDTOList(List<User> users);
}
