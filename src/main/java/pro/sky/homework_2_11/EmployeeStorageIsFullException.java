package pro.sky.homework_2_11;

public class EmployeeStorageIsFullException extends RuntimeException{

    public EmployeeStorageIsFullException(String message){
        super(message);
    }
}