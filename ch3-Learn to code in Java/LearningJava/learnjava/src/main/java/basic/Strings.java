package basic;

public class Strings {

    public static void main(String[] args) {

        String vehicle = "Trunk";
        String make = "Chevy";
        String model = "Tahoe";

        String fullVehicleDetails = vehicle + " - " + make + " : " + model;
        System.out.println(fullVehicleDetails);

        String upper = "CRAZY BEAST!";
        String lower = upper.toLowerCase();
        System.out.println(lower);

        int accountBalance = 500;
        String printBalance = String.format("Your account balance is %d", accountBalance);
        System.out.println(printBalance);
    }
}
