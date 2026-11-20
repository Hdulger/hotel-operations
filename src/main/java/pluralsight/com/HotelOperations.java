package pluralsight.com;

public class HotelOperations {

    public static void main(String[] args) {
        Reservation r1=new Reservation("king", 2, true);
        Reservation r2=new Reservation("double", 3, false);
        System.out.println(r1.getPrice()+" "+ r1.isWeekdays()+" "+r1.getReservationTotal());
        System.out.println(r2.getPrice()+" "+ r2.isWeekdays()+" "+r2.getReservationTotal());




        Employee emp1=new Employee(12222, "Hande", "IT", 10);
        System.out.println(emp1.getRegularHours()+" "+ emp1.getTotalPay());

         emp1.punchIn();







    }
}
