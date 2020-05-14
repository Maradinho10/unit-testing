package com.maradinho.model.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ContactDto extends BaseDto {
    private String name;
    private String comments;
    private String phone;
    private Date dob;
}
