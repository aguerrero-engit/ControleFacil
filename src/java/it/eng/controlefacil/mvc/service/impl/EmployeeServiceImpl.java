package it.eng.controlefacil.mvc.service.impl;

import it.eng.controlefacil.mvc.model.dao.EmployeeDAO;
import it.eng.controlefacil.mvc.model.entity.Employee;
import it.eng.controlefacil.mvc.service.interfaces.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author B100007
 * http://www.javacodegeeks.com/2010/07/gwt-2-spring-3-jpa-2-hibernate-35.html
 * para el resto de funciones
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDAO employeeDao;

    @Override
    public Employee findEmployeeById(String emplId) {
        return employeeDao.findById(emplId);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    public Employee testMe() {
        Employee empl = new Employee();
        empl.setName("Paco Paquito");
        return empl;
    }

}
