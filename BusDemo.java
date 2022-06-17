package com.reservationsystem;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo
{



    static Scanner scan=new Scanner(System.in);
    static Scanner sc=new Scanner(System.in);
    private static final Logger log=Logger.getLogger(BusDemo.class);
    public void displayMenu() throws Exception {
        ArrayList<BusInformation> buses=new ArrayList<>();
        ArrayList<Booking> bookings=new ArrayList<>();

        buses.add(new BusInformation(3781,true,20));
        buses.add(new BusInformation(1802,false,22));
        buses.add(new BusInformation(2108,true,18));

        for(BusInformation b:buses)
        {
            b.displayInformation();
        }

        String user="b";
        while(user.charAt(0)=='b'||user.charAt(0)=='B')
        {
            log.info("Enter b or B to book and e or E to exit");
            user=scan.nextLine();
            if(user.charAt(0)=='b'||user.charAt(0)=='B')
            {
                Booking booking=new Booking();
                if(booking.isAvailable(buses,bookings))
                {
                    bookings.add(booking);
                        log.info("Your booking is conformied ");
                }
                else
                    log.warn("sorry this bus is full , try another bus or date");

            }
        }
    }

    public static void main(String[] args) throws Exception{
        BusDemo ob=new BusDemo();
        ob.displayMenu();
    }


}
