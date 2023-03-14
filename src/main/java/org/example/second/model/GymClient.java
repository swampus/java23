package org.example.second.model;
import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
@Table(name = "gymclient", schema = "public")
public class GymClient {
    @Id
    private Long id;
    @Column(name ="name")
    private String name;
    @Column(name ="surname")
    private String surname;
    @Column(name ="idcode")
    private String idcode;


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

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
