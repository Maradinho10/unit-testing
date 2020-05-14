package com.maradinho.model.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "contact")
@SQLDelete(sql = "UPDATE person SET deleted = CURRENT_TIMESTAMP WHERE id = ?")
@Where(clause = "deleted_date is null")
public class Contact extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private String phone;

    @Column(name = "date_of_birth")
    private Date dob;

    @Column(name = "comments")
    private String comments;
}
