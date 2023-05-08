package com.CRUD.CRUD_Test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/***
 * Lombok ist eine Java-Bibliothek,
 * die die Schreibarbeit bei der Erstellung von POJOs (Plain Old Java Objects) reduziert.
 * Die Bibliothek verwendet Annotationen, um Getter- und Setter-Methoden, Konstruktoren, toString-
 * , equals-, und hashCode-Methoden automatisch zu generieren.
 * Durch die Verwendung von Lombok-Annotationen können Entwickler den Boilerplate-Code reduzieren
 * und die Lesbarkeit ihres Codes verbessern.
 */
import java.io.Serializable;

@Data  // eine Annotation für automatisch Generation von Getter und Setter
@NoArgsConstructor // Annotation  für Generation von Konstruktor ohne Argumente
@AllArgsConstructor // Annotation für Generation von Konstruktor alle Felder einer Klasse

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
