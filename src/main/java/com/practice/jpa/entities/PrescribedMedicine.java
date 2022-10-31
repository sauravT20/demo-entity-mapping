package com.practice.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PrescribedMedicine {
    //Id,Medicine.MedicineID,purpose,frequency,comment,dosage,StartDate,duration,List<Consumption Time>
    @Id
    @GeneratedValue
    private int prescribedMedicineId;

    private String purpose;
    private int frequencyInHours;
    private String comment;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    private int durationInDays;
    @OneToMany(targetEntity = Healthparameters.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "userId_fk",referencedColumnName = "userId")
    private List<Medicine> medicineList;

}
