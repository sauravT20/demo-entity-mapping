package com.practice.jpa.entities.enums;

public enum BloodGroup {

    O_POS("O+"), O_NEG("O-"), A_POS("A+"), A_NEG("A-"), B_POS("B+"), B_NEG("B-"), AB_POS("AB+"), AB_NEG("AB-"), NO_ANSWER(
            "NA");
    private String code;

    BloodGroup(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
