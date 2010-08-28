package it.eng.controlefacil.mvc.model.dao;

import it.eng.controlefacil.mvc.model.entity.Employee;
import javax.annotation.PostConstruct;
import javax.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Manuel Guerrero
 */

@Repository("employeeDao")
public class EmployeeDAO extends JpaDAO<String, Employee>{
    @Autowired
    protected EntityManagerFactory entityManagerFactory;

    @PostConstruct
    public void init() {
        super.setEntityManagerFactory(entityManagerFactory);
    }
}
