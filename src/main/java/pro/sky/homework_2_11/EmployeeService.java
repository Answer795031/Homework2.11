package pro.sky.homework_2_11;

import java.util.Collection;

public interface EmployeeService {

    Employee addNewEmployee(String firstName, String lastName, int passportNumber, int salary, int departmentId)
            throws EmployeeStorageIsFullException, EmployeeAlreadyAddedException;

    Employee removeEmployee(String firstName, String lastName, int passportNumber, int salary, int departmentId)
            throws EmployeeNotFoundException;

    Employee findEmployee(String firstName, String lastName, int passportNumber, int salary, int departmentId)
            throws EmployeeNotFoundException;

    Collection<Employee> findAll();

    String employees();
}
