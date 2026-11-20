package pluralsight.com;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public boolean isWeekdays(){
        return !weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getPrice() {
        double price=0;
        if (this.roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        } else if (this.roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        }else{
            System.out.println("Please enter a valid input");
        }
        return price;
    }
    public double getReservationTotal(){

        return  this.getPrice()*this.numberOfNights;
    }


}

