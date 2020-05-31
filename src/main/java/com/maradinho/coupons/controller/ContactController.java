package com.maradinho.coupons.controller;

import com.maradinho.coupons.model.dtos.ContactDto;
import com.maradinho.coupons.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    private ContactService service;

    @GetMapping(value = "/contacts", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<ContactDto>> getContacts() {
        return ResponseEntity.ok(service.findAll());
    }
}
