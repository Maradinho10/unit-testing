package com.maradinho.coupons.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Setter
@Getter
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    @Column(name = "deleted_date")
    private Timestamp deletedDate;

    @PrePersist
    protected void onCreate() {
        setCreatedDate(new Timestamp(new Date().getTime()));
        setUpdatedDate(getCreatedDate());
    }

    @PreUpdate
    protected void onUpdate() {
        this.setUpdatedDate(new Timestamp(new Date().getTime()));
    }
}
