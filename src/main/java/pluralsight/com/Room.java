package pluralsight.com;

public class Room {
     int numberOfBeds;
     boolean occupied=true;
      boolean dirty=true;
     double price;
     int roomNumber;

    public Room(int numberOfBeds, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.occupied = occupied;
        this.dirty = dirty;
    }
    public Room(int roomNum){
        this.roomNumber=roomNum;

    }
    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }

   public double getPrice(){
        return this.price*this.getNumberOfBeds();
   }


    public boolean isDirty(){
        return this.dirty;
    }
    public boolean isOccupied(){
        return this.occupied;
    }

    public boolean isAvailable(){
        return !occupied;
    }
    public boolean isCleanRoom() {
        return !dirty;
    }

    public void isCheckIn(){
       this.occupied=true;
       this.dirty=true;

    }
    public void isCheckOut(){
        if(!occupied && dirty) {
            System.out.println("It needs to be cleaned by housekeeper");
        } else if (!occupied && isCleanRoom()) {
            System.out.println("Room is ready!");
        }else {
            System.out.println("Still occupied");
        }

    }
}
