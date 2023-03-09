package org.example.second.model;

public class GymClient {


    private String name;
    private String surname;
    private String idCode;

    public GymClient(String name, String surname,
                     String idCode) {
        this.name = name;
        this.surname = surname;
        this.idCode = idCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }
}
