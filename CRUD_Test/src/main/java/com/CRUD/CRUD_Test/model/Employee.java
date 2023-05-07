package com.CRUD.CRUD_Test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee implements Serializable {
    private int id ;
    private String name;
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
