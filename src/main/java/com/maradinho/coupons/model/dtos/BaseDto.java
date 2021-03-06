package com.maradinho.coupons.model.dtos;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class BaseDto implements Serializable {
    private Long id;
    private Date createdDate;
    private Date updatedDate;
}
