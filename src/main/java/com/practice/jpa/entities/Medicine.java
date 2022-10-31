package com.practice.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Medicine {
    //Id,MedicineName
    @Id
    public int medicineId;
    private String medicineName;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "medicineId_fk",referencedColumnName = "medicineId")
    private ConsumptionTime consumptionTime;
}
