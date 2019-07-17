package com.tw.apistackbase.core;

import javax.persistence.*;

@Entity
@Table
public class CompanyProfile {

    @Id
    private String certId;
    private Integer registeredCapital;

    public  CompanyProfile(){}

    public CompanyProfile(Integer registeredCapital, String certId) {
        this.registeredCapital = registeredCapital;
        this.certId = certId;
    }

    public Integer getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(Integer registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }
}
