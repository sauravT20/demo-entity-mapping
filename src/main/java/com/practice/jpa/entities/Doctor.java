package com.practice.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Doctor {
    //Id, Name, Registration Id,Speciality
    @Id
    @GeneratedValue
    private int doctorId;
    private String name;
    private int registrationId;
    private String speciality;

}
