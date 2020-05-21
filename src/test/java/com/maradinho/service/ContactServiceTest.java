package com.maradinho.service;

import com.maradinho.AbstractTest;
import com.maradinho.model.dtos.ContactDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

class ContactServiceTest extends AbstractTest {
    @Autowired
    private ContactService service;

    @Test
    void test_findAll() {
        List<ContactDto> contacts = service.findAll();
        assertFalse(contacts.isEmpty(), "Contacts returned");
    }

    @Test
    void test_add() {
    }

    @Test
    void test_save() {
    }
}