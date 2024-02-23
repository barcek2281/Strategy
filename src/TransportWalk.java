public class TransportWalk  implements ITransport{
    private double speed = 25;
    private double costOFkg = 50;
    @Override
    public void transport(double cargo, double distance){
        System.out.println("Transporting by walk....");

        System.out.println("Cost:" + cargo/costOFkg + "$");

        System.out.println("Time:" + distance/speed + "h.");
    }
}
