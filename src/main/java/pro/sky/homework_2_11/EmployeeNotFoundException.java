package pro.sky.homework_2_11;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(String message){
        super(message);
    }
}