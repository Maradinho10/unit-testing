package com.maradinho.coupons.model.mapper;

import com.maradinho.coupons.model.dtos.ContactDto;
import com.maradinho.coupons.model.entities.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ContactMapper {
    ContactDto entityToDto(Contact entity);
    List<ContactDto> entitiesToDtos(List<Contact> entities);
    Contact dtoToEntity(ContactDto dto);
}
