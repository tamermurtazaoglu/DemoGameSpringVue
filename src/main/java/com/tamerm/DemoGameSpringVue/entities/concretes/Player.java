package com.tamerm.DemoGameSpringVue.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birthdate")
    private Date birthDate;

    @Column(name = "birthcity")
    private String birthCity;

    @Column(name = "is_active")
    private boolean isActive = true;

    @Column(name = "score")
    private int score;

}
