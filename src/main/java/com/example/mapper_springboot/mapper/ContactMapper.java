package com.example.mapper_springboot.mapper;

import com.example.mapper_springboot.dto.ContactDTO;
import com.example.mapper_springboot.entity.Contact;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContactMapper {

    Contact toEntity(ContactDTO contactDTO);

    ContactDTO toDTO(Contact contact);

    List<ContactDTO> toDTOList(List<Contact> contacts);
}
