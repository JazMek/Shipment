import java.util.Date;

public class ShipmentStatus {

    private String arrivalPort;
    private String departurePort;
    private Date arrivedDate;
    private String status;
    private Shipment shipment;

    public String getArrivalPort() {
        return arrivalPort;
    }
    public Date getArrivedDate() {
        return arrivedDate;
    }
    public ShipmentStatus(String departurePort, String arrivalPort, Date arrivedDate, String status) {
        this.departurePort = departurePort;
        this.arrivalPort = arrivalPort;
        this.arrivedDate = arrivedDate;
        this.status = status;
    }
    public ShipmentStatus() {
    }
    public ShipmentStatus(String departurePort, String arrivalPort, Date arrivedDate, String status, Shipment shipment) {
        this.departurePort = departurePort;
        this.arrivalPort = arrivalPort;
        this.arrivedDate = arrivedDate;
        this.status = status;
        this.shipment = shipment;
    }
}

