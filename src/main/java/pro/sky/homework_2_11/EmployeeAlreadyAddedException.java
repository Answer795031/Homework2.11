package pro.sky.homework_2_11;

public class EmployeeAlreadyAddedException extends RuntimeException{

    public EmployeeAlreadyAddedException(String message){
        super(message);
    }
}