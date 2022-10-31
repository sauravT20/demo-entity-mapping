package com.practice.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Healthparameters {
    //Id,User.Id,Weight,Height,date,bp
    @Id
    @GeneratedValue
    public int healtparameterId;
    private double weightInKg;
    private double heightInfeet;
    private Date dateOfMeasurment;
    private double bloodPressure;


}
