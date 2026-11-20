package pluralsight.com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    int hoursWorked;
     int startTime;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;


    }
    public Employee(String name){
        this.name=name;
    }

    public double getTotalPay(){
        return this.payRate*this.hoursWorked;
    }

    public double getRegularHours(){

        if (this.hoursWorked>40){
            return 40;
        }else {
         return hoursWorked;
        }
    }

    public double OverTimeHours(){

        if (this.hoursWorked>40){
            return hoursWorked;
        }else {
            return 0;
        }
    }
    public void punchIn(int startTime){
        System.out.println("hey, " + this.name + "punched in at: " + startTime);

        this.startTime=startTime;
    }
    public int punchIn() {

        return LocalTime.now().getHour();
    }


    public void punchOut(int outTime){
        System.out.println("hey, " + this.name + "punched in at: " + startTime);

        this.startTime=outTime;

    }
    public void punchOut(){
        int endHour=punchIn()-LocalTime.now().getHour();
    }
    //public int getHoursWorked(int startTime, int endTime){
       //return this.hoursWorked=punchOut(startTime)-punchIn(endTime);

    }





