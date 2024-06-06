package Activities;

interface BicycleParts{

    public int gears = 0;
    public int speed = 0;
}

interface BicycleOperations{

    public void applyBrake(int decrement);
    public void speedUp(int increment);
}


class Bicycle implements BicycleParts ,BicycleOperations {

    public int gears;
    public int speed;

    public Bicycle(int gear, int speed){
        this.gears = gear;
        this.speed = speed;
    }


    public void applyBrake(int decrement) {
        speed -= decrement;
        System.out.println("The decreased speed "+speed);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("The increased speed "+speed);
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + speed);
    }

}

class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gear, int speed,int seatHeight) {
        super(gear, speed);
    }


    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + speed +"\nSetHeight of bicycle is " + seatHeight );
}

public static class activity7 {
    public static void main(String args[]){
        MountainBike mb = new MountainBike(1,45,5);
        mb.speedUp(10);
        mb.applyBrake(15);
        System.out.println(mb.bicycleDesc());
    }
}





}
