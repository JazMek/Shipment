
public class ShipmentBO {

    public void displayStatusOfShipment(Shipment shipment){
    for(ShipmentStatus ship:shipment.getShipmentStatus()){
        if(shipment.getDestinationPort().equals(ship.getArrivalPort())){
            if(shipment.getExpectedDeliveryDate().before(ship.getArrivedDate())){
                System.out.println("The shipment arrived after the expected date");
            }else if(shipment.getExpectedDeliveryDate().after(ship.getArrivedDate())){
                System.out.println("The shipment arrived before the expected date");
            }else System.out.println("The shipment arrived on time ");
          }
        }
    }

}
