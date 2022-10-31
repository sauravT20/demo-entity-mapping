package com.practice.jpa.entities;


import com.practice.jpa.entities.enums.BloodGroup;
import com.practice.jpa.entities.enums.Gender;
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
public class User {
    //Id,Name,DOB,bloodgroup,Address, Phone number,gender
    @Id
    @GeneratedValue
    private int userId;
    private String firstName;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private BloodGroup bloodGroup;
    private String address;
    private String phoneNumber;
    private Gender gender;

    @OneToMany(targetEntity = Healthparameters.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "userId_fk",referencedColumnName = "userId")
    private List<Healthparameters> healthParametersList;

    @OneToMany(targetEntity = Healthparameters.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "userId_fk",referencedColumnName = "userId")
    private List<DoctorVisit> doctorVisitList;

}
