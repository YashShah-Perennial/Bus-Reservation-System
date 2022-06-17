package com.reservationsystem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import org.apache.log4j.Logger;
public class Booking
{static Scanner scan =new Scanner(System.in);
    static Scanner sc =new Scanner(System.in);
    private static final Logger log=Logger.getLogger(Booking.class);
    String passengerName;
    int busNo;
    Date date;
    Booking() throws Exception
    {
        log.info("Enter the busno");
        busNo= scan.nextInt();
        log.info("Enter passenger name");
        passengerName=sc.nextLine();
        log.info("Enter the date dd-mm-yyyy");
        String dateInput=scan.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        date=dateFormat.parse(dateInput);
    }
    public boolean isAvailable( ArrayList<BusInformation> buses,ArrayList<Booking> bookings)
    {
        int capacity=0;
        for(BusInformation bus :buses)
        {
            if(bus.getBusNO()==busNo )
                capacity=bus.getCapacity();
        }
        int booked=0;
                for(Booking b: bookings)
                {
                    if (b.busNo==busNo && b.date.equals(date))
                    {
                        booked++;
                    }
                }
                return booked <capacity ? true:false;
    }
}
