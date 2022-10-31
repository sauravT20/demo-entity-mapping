package com.practice.jpa.entities.enums;

public enum Gender {
    MALE(1),FEMALE(0),OTHER(-1);
    private Integer code;

    Gender(Integer code) {
        this.code =code;
    }

    public Integer getCode() {
        return code;
    }
}
