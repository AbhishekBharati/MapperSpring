package com.example.mapper_springboot.controller;

import com.example.mapper_springboot.dto.ContactDTO;
import com.example.mapper_springboot.entity.Contact;
import com.example.mapper_springboot.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/contact")
    public ResponseEntity<Contact> saveContact(@RequestBody ContactDTO contactDTO){
        return ResponseEntity.ok(contactService.saveContact(contactDTO));
    }

    @GetMapping("/contact/{id}")
    public ResponseEntity<ContactDTO> getContactById(@PathVariable Long id){
        return ResponseEntity.ok(contactService.getContactById(id));
    }

    @GetMapping("/contacts")
    public ResponseEntity<List<ContactDTO>> getContactList(){
        return ResponseEntity.ok(contactService.getContactList());
    }
}
