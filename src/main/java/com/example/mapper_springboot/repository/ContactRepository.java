package com.example.mapper_springboot.repository;

import com.example.mapper_springboot.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
