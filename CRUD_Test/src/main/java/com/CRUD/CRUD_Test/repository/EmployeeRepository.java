package com.CRUD.CRUD_Test.repository;

import com.CRUD.CRUD_Test.model.Employee;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeRepository {
    private HashOperations<String, Integer, Employee> hashOperations;
    private RedisTemplate<String, Employee> redisTemplate;

    public EmployeeRepository(RedisTemplate<String, Employee> redisTemplate) {
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
