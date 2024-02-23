import java.util.Scanner;

public class Delivering {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.println("Do you wanna make delivery? (Y/N)");

        String action = scn.nextLine();

        if (action.equalsIgnoreCase("Y")){
            try {
                System.out.println("How much does your cargo weigh? (kg)");
                int cargo = scn.nextInt();
                System.out.println("What is the distance between the points? (km)");
                int distance = scn.nextInt();
                Delivery delivery = new Delivery(cargo, distance);

                System.out.println("Choice of variation transporting" + "\n" +
                                    "1) By walk" + "\n" +
                                    "2) By Car" + "\n" +
                                    "3) By Plane");

                String choice = scn.next();

                switch (choice){
                    case "1": delivery.processDelivery(new TransportWalk()); break;
                    case "2": delivery.processDelivery(new TransportCar()); break;
                    case "3": delivery.processDelivery(new TransportPlane()); break;
                    default: break;
                }


            }catch (Exception e){

                System.out.println("Something went wrong");
            }
        }
    }
}
