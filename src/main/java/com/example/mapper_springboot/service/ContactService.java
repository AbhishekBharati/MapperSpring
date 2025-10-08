package com.example.mapper_springboot.service;

import com.example.mapper_springboot.dto.ContactDTO;
import com.example.mapper_springboot.entity.Contact;
import com.example.mapper_springboot.mapper.ContactMapper;
import com.example.mapper_springboot.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private ContactMapper contactMapper;

    public Contact saveContact(ContactDTO contactDTO){
//        Contact contact = Contact.builder()
//                .firstName(contactDTO.getFirstName())
//                .lastName(contactDTO.getLastName())
//                .email(contactDTO.getEmail())
//                .phoneNo(contactDTO.getPhoneNo())
//                .build();
//        return contactRepository.save(contact);
        return contactRepository.save(contactMapper.toEntity(contactDTO));
    }

    public ContactDTO getContactById(Long id){
//        Optional<Contact> contact = contactRepository.findById(id);
//        return contact.map(value -> ContactDTO.builder()
//                .firstName(value.getFirstName())
//                .lastName(value.getLastName())
//                .email(value.getEmail())
//                .phoneNo(value.getPhoneNo())
//                .build()).orElse(null);
        return contactMapper.toDTO(contactRepository.findById(id).orElse(new Contact()));
    }

    public List<ContactDTO> getContactList(){
//        List<Contact> contacts = contactRepository.findAll();
//        return contacts.stream().map(contact ->
//                ContactDTO.builder()
//                        .firstName(contact.getFirstName())
//                        .lastName(contact.getLastName())
//                        .email(contact.getEmail())
//                        .phoneNo(contact.getPhoneNo())
//                        .build()).toList();
        return contactMapper.toDTOList(contactRepository.findAll());
    }
}
