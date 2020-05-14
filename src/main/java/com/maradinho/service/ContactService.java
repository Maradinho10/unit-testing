package com.maradinho.service;

import com.maradinho.model.daos.ContactRepository;
import com.maradinho.model.dtos.ContactDto;
import com.maradinho.model.entities.Contact;
import com.maradinho.model.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
     @Autowired
     private ContactRepository repository;

     @Autowired
     private ContactMapper mapper;

    public List<ContactDto> findAll() {
        List<Contact> contacts = repository.findAll(Sort.by(Sort.Direction.ASC, "name"));

        return mapper.entitiesToDtos(contacts);
    }
}
