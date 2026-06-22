package com.survivalcoding;

public class Patent extends IntangibleAsset {
    private String patentNumber;

    public Patent(String name, String patentNumber) {
        super(name);
        this.patentNumber = patentNumber;
    }

    public String getPatentNumber() {
        return patentNumber;
    }
}
