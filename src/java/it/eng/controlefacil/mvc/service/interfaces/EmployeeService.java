package it.eng.controlefacil.mvc.service.interfaces;

import it.eng.controlefacil.mvc.model.entity.Employee;
import java.util.List;

/**
 *
 * @author B100007
 */
public interface EmployeeService {
    public Employee findEmployeeById(String emplId);
    public List<Employee> findAll();
}
