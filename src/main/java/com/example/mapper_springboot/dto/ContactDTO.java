package com.example.mapper_springboot.dto;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class ContactDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
}
