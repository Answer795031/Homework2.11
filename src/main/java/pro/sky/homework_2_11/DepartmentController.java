package pro.sky.homework_2_11;
import org.springframework.web.bind.annotation.*;
import pro.sky.homework_2_11.DepartmentService;
import pro.sky.homework_2_11.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @ExceptionHandler
    public String handleException(RuntimeException e) {
        return e.getMessage();
    }

    // поиск сотрудника с максимальной з/п в отделе
    @GetMapping(path = "/max-salary")  // /departments/max-salary?departmentId=1
    public Employee findMaxSalary(@RequestParam("departmentId") int departmentId) {
        return departmentService.findMaxSalary(departmentId);
    }

    // поиск сотрудника с минимальной з/п в отделе
    @GetMapping(path = "/min-salary")  // /departments/min-salary?departmentId=1
    public Employee findMinSalary(@RequestParam("departmentId") int departmentId) {
        return departmentService.findMinSalary(departmentId);
    }

    // поиск всех сотрудников в отделе
    @GetMapping(path = "/all", params = {"departmentId"})  // /departments/all?departmentId=1
    public Collection<Employee> findAll(@RequestParam Integer departmentId) {
        return departmentService.findAll(departmentId);
    }

    // поиск всех сотрудников с группировкой по отделам
    @GetMapping(path = "/all")  // /departments/all
    public Map<Integer, List<Employee>> findAll() {
        return departmentService.findAll();
    }
}
