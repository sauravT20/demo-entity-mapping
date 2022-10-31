package com.practice.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DoctorVisit {
   //Id, User.Id,Doctor.Id,date&Time
    @Id
    @GeneratedValue
    private int doctorVisitId;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "doctorVisitId_fk",referencedColumnName = "doctorVisitId")
    private Doctor doctor;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
}
