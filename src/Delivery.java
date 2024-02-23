public class Delivery {
    private int totalCost=0;
    private int cargo;

    private int distance;

    Delivery(int cargo, int distance){
        this.cargo = cargo;
        this.distance = distance;
    }
    public void processDelivery(ITransport itransport){

        itransport.transport(cargo, distance);
    }
}
