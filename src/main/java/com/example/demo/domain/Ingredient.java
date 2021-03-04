package com.example.demo.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ingredient {
    @Id
    public UUID id;
    public String name;
    public double price;
}
