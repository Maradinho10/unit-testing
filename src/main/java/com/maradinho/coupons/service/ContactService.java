package com.maradinho.coupons.service;

import com.maradinho.coupons.model.daos.ContactRepository;
import com.maradinho.coupons.model.dtos.ContactDto;
import com.maradinho.coupons.model.entities.Contact;
import com.maradinho.coupons.model.mapper.ContactMapper;
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

    public ContactDto add(ContactDto param) {
        return null;
    }

    public Contact save(Contact param) {
        return repository.save(param);
    }
}
