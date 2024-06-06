package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private int maxPassengers;
    private List<String> passengers;
    private Date lastTakeoffTime;
    private Date lastLandedTime;

    public Plane(int maxPassengers){
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger){
        this.passengers.add(passenger);
    }

    public Date takeOff() {
        this.lastTakeoffTime = new Date();
        return lastTakeoffTime;

    }

    public void land() {
        this.lastLandedTime = new Date();
        this.passengers.clear();
    }

    public Date landedtime() {
        return lastLandedTime;
    }

    public List<String> getPassengers() {
        return passengers;
    }

}


public class activity6{
    public static void main(String[] args) throws InterruptedException {
        Plane flight = new Plane(10);
        flight.onboard("Manasa");
        flight.onboard("Avinash");
        flight.onboard("Jeswi");
        flight.onboard("Tarak");
        System.out.println("Flight take off time is " +flight.takeOff());
        System.out.println("Passengers travelling in flight are  " +flight.getPassengers());
        Thread.sleep(5000);
        flight.land();
        System.out.println("Flight landed time is "+flight.landedtime());
        System.out.println("People on the plane after landing "+flight.getPassengers());
    }
}

