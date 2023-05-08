package com.CRUD.CRUD_Test.controler;

import com.CRUD.CRUD_Test.model.Employee;
import com.CRUD.CRUD_Test.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @RestController
 * Annotationen aus der Spring MVC (Model-View-Controller)-Bibliothek,
 * die verwendet werden, um RESTful Web Services in einer Spring-basierten
 * Anwendung zu implementieren.
 */
@RestController

/**
 * @RequestMapping
 * URL-Pfad und die HTTP-Methoden anzugeben
 * Durch die Verwendung von @RequestMapping können Entwickler
 * den Pfad und die Methoden,auf die eine bestimmte Methode
 * oder ein Controller reagiert, einfach definieren.
 *
 */
@RequestMapping("/api")
public class EmployeeControler {
    /**
     *@Autowired
     * Annotation in der Spring Framework Bibliothek, die verwendet wird
     * um Abhängigkeiten zwischen verschiedenen Komponenten einer
     *Anwendung zu verwalten.
     * Durch die Verwendung von @Autowired kann Spring automatisch
     * eine Instanz eines Objekts bereitstellen,
     * auf das eine andere Klasse angewiesen ist.
     * Das bedeutet, dass Entwickler sich nicht darum kümmern müssen,
     * wie eine Abhängigkeit initialisiert und verwaltet wird.
     */
    @Autowired
    private EmployeeRepository employeeRepository ;

    /**
     * @PostMapping ist eine Annotation in der Spring MVC (Model-View-Controller)-Bibliothek,
     * die verwendet wird,
     * um eine Methode als Handler-Methode für
     * HTTP POST-Anfragen zu markieren.
     */
    @PostMapping("/employees")
    /**
     * Method für Hinzufügen  von Employee
     */
    public Employee saveEmployee(@RequestBody Employee em) {
       employeeRepository.saveEmployee(em);
       return em;
    }
@GetMapping("/employees")
/**
 * Method für Suchen nach  alle  Employee
 */
    public List<Employee> findAll(){
        return employeeRepository.findAll();

}
@PutMapping("/employees")
/**
 * Method für Update von  Employee
 */
public  void  update(@RequestBody Employee em){
    employeeRepository.update(em);
}
@DeleteMapping("/employees/{id}")
/**
 * Method für Entsorgen von  Employee
 */
    public void delete(@PathVariable("id") Integer id){
        employeeRepository.delete(id);
}
}
