package org.meicode.Health;

public class Organ {
    private String name;
    private String medicalCondition;

    public void getDetails()
    {
        System.out.println("Name :" + this.getName());
        System.out.println("Medical Condition :"+this.getMedicalCondition());
    }

    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }
}
