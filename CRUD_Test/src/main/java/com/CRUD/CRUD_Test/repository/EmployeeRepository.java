package com.CRUD.CRUD_Test.repository;

import com.CRUD.CRUD_Test.model.Employee;
/**
 * HashOperations-klasse
 * Hashes sind eine der komplexeren Datenstrukturen in Redis,
 * die verwendet werden können, um komplexe Daten wie z.B.
 * Benutzerprofile oder Konfigurationsdaten zu speichern.
 */
import org.springframework.data.redis.core.HashOperations;
/**
 * RedisTemplate-Klasse
 * ist ein zentrales Element dieser Bibliothek und bietet eine
 * Abstraktionsschicht für die Interaktion mit Redis.
 * Sie ermöglicht es, Daten in Redis zu speichern,
 * abzurufen, zu aktualisieren und zu löschen.
 */
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public class EmployeeRepository {
    private HashOperations<String, Integer, Employee> hashOperations;
    private RedisTemplate<String, Employee> redisTemplate;

    public EmployeeRepository(RedisTemplate<String, Employee> redisTemplate) {
        /**
         * opsForHash()-Methode bietet eine vereinfachte API
         * zum Ausführen von Operationen auf Hashe
         */
        this.hashOperations = redisTemplate.opsForHash();
        this.redisTemplate = redisTemplate;
    }

    public void saveEmployee(Employee em) {
        hashOperations.put("EMPLOYEE", em.getId(), em);
    }

    public List<Employee> findAll() {
        return hashOperations.values("EMPLOYEE");
    }

    public Employee findById(Integer id) {
        return hashOperations.get("EMPLOYEE", id);
    }
    public  void  update(Employee e){
        saveEmployee(e);
    }
    public void delete(Integer i){
        hashOperations.delete("EMPLOYEE", i);

    }
}
