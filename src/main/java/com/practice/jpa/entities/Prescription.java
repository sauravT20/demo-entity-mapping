package com.practice.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Prescription {
    //Id, DoctorVisit.id,List<Medicine.Id>,symptoms,NextVisitTime
    @Id
    @GeneratedValue
    private int prescriptionId;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "doctorVisitId")
    private DoctorVisit doctorVisit;
    private String symptoms;
    @Temporal(TemporalType.TIMESTAMP)
    private Data nextVisitTime;

    @OneToMany(targetEntity = Healthparameters.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "prescriptionId_fk",referencedColumnName = "prescriptionId")
    private List<Medicine> medicinesList;
}
