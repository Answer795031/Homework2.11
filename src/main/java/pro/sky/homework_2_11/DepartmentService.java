package pro.sky.homework_2_11;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {

    Employee findMaxSalary(Integer departmentId) throws EmployeeNotFoundException;

    Employee findMinSalary(Integer departmentId) throws EmployeeNotFoundException;

    Collection<Employee> findAll(Integer departmentId);

    Map<Integer, List<Employee>> findAll();
}
