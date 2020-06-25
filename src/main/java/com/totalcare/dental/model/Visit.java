package com.totalcare.dental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Visit extends BaseEntity
{
    private Date date;
    private String description;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Dentist dentist;
}
