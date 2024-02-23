public class TransportCar implements ITransport{
    private double speed = 150;
    private double costOFkg = 100;
    @Override
    public void transport(double cargo, double distance){
        System.out.println("Transport by Car");

        System.out.println("Cost:" + cargo/costOFkg + "$");

        System.out.println("Time:" + distance/speed + "h.");
    }
}
