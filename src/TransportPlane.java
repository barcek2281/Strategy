public class TransportPlane implements ITransport{
    private double speed = 340;
    private double costOFkg = 1500;

    @Override
    public void transport(double cargo, double distance){
        System.out.println("Transport by Plane..");

        System.out.println("Cost:" + cargo/costOFkg + "$");

        System.out.println("Time:" + distance/speed + "h.");

    }


}
