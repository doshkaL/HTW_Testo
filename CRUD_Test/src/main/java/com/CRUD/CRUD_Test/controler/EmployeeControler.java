package com.CRUD.CRUD_Test.controler;

import com.CRUD.CRUD_Test.model.Employee;
import com.CRUD.CRUD_Test.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class EmployeeControler {
    @Autowired
    private EmployeeRepository employeeRepository ;

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee em) {
       employeeRepository.saveEmployee(em);
       return em;
    }
@GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeRepository.findAll();

}
@PutMapping("/employees")
public  void  update(@RequestBody Employee em){
    employeeRepository.update(em);
}
@DeleteMapping("/employees/{id}")
    public void delete(@PathVariable("id") Integer id){
        employeeRepository.delete(id);
}
}
