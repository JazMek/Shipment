import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        ShipmentBO shipmentBO =new ShipmentBO();
        System.out.println("Enter the shipment details :");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] sh_det_Ary=br.readLine().split(",");
        Shipment shipment=  new Shipment(sh_det_Ary[0],sh_det_Ary[1],sh_det_Ary[2],convertToDate(sh_det_Ary[3]), sh_det_Ary[4]);
        System.out.println("Enter the number of shipment status :");
        int num_of_ship_st=Integer.parseInt(br.readLine());
        ShipmentStatus[] shipmentStatuses=new ShipmentStatus[num_of_ship_st];
        for(int i=0;i<num_of_ship_st;i++){
            int j=i;
            System.out.println("Enter the shipment status" +(1+j)+ "details :");
            String [] stat_de=br.readLine().split(",");
            shipmentStatuses[i]= new ShipmentStatus(stat_de[0], stat_de[1], convertToDate(stat_de[2]), stat_de[3]);
        }
        shipment.setShipmentStatus(shipmentStatuses);
        shipmentBO.displayStatusOfShipment( shipment);
    }
    private static Date convertToDate(String date){
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date dt = null; try { dt = df.parse(date);
        } catch (ParseException e) { System.out.println("Error in date parsing"); }
        return dt; }

}
//        SimpleDateFormat formator= new SimpleDateFormat("dd-MM-yyyy");
//        Date date=formator.parse(sh_det_Ary[3]);
//        System.out.println(date);
//        System.out.println("This is the date "+formator.format(date));
//         Shipment(String id, String sourcePort, String destinationPort, Date expectedDeliveryDate, String customerName)