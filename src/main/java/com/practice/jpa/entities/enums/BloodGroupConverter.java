package com.practice.jpa.entities.enums;

import com.practice.jpa.entities.enums.BloodGroup;

import javax.persistence.AttributeConverter;
import java.util.stream.Stream;

public class BloodGroupConverter implements AttributeConverter<BloodGroup,String> {

    @Override
    public String convertToDatabaseColumn(BloodGroup bloodGroup) {
        if (bloodGroup == null) {
            return null;
        }
        return bloodGroup.getCode();
    }

    @Override
    public BloodGroup convertToEntityAttribute(String code) {
        if (code == null) {
            return null;
        }

        return Stream.of(BloodGroup.values())
                .filter(c -> c.getCode().equals(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

}
