package com.maradinho.coupons.model.daos;

import com.maradinho.coupons.model.entities.Contact;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
    List<Contact> findAll(Sort sort);
}
