package pluralsight.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {


    @Test
    void isCheckIn() {
        //arrange
        Room rm1=new Room(1);

        //act
        rm1.isCheckIn();

        //assert
        Assertions.assertEquals(true, rm1.isOccupied());
        Assertions.assertEquals(false, rm1.isCleanRoom());

    }

    @Test
    void isCheckOut() {
        //arrange
        Room rm1=new Room(2);

        //act
        rm1.isCheckOut();

        //assert
        Assertions.assertEquals(true, rm1.isDirty());
        assertFalse(rm1.isAvailable());


    }

    @Test
    void isCleanRoom() {
        //arrange
        Room rm1=new Room(1);

        //act
        rm1.isCleanRoom();

        //assert
        Assertions.assertEquals(false, rm1.isCleanRoom());



    }

}