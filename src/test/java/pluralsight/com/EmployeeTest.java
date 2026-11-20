package pluralsight.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testPunchIn_for_positive_hour_less_than_24() {
        //arrange
        Employee emp1=new Employee("Hande");

        //act
        emp1.punchIn(8);

        //assert
        Assertions.assertEquals(8, emp1.startTime);



    }





    @Test
    void testPunchOut() {
        //arrange
        Employee emp1=new Employee("Hande");

        //act
        emp1.punchOut(17);

        //assert
        Assertions.assertEquals(9, emp1.hoursWorked);
    }

}