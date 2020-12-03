import java.util.Date;

public class Shipment {
    private String id;
    private String sourcePort;
    private String destinationPort;
    private Date expectedDeliveryDate;
    private String customerName;
    private ShipmentStatus[] shipmentStatus;

    public Shipment(ShipmentStatus[] shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }
    public void setShipmentStatus(ShipmentStatus[] shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }
    public String getDestinationPort() {
        return destinationPort;
    }
    public Date getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }
    public ShipmentStatus[] getShipmentStatus() {
        return shipmentStatus;
    }
    public Shipment(String sourcePort, String destinationPort, Date expectedDeliveryDate, ShipmentStatus[] shipmentStatus) {
        this.sourcePort = sourcePort;
        this.destinationPort = destinationPort;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.shipmentStatus = shipmentStatus;
    }
    public Shipment(){
    }
    public Shipment(String id, String sourcePort, String destinationPort, Date expectedDeliveryDate, String customerName) {
        this.id = id;
        this.sourcePort = sourcePort;
        this.destinationPort = destinationPort;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.customerName = customerName;
    }

}
