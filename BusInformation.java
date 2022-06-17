package com.reservationsystem;

import org.apache.log4j.Logger;

public class BusInformation {
    private static final Logger log=Logger.getLogger(BusInformation.class);
   private int busNO;
   private boolean ac;
   private int capacity;
    BusInformation(int busNO,boolean ac, int capacity)
    {
        this.setBusNO(busNO);
        this.setAc(ac);
        this.setCapacity(capacity);
    }

    public int getBusNO() {
        return busNO;
    }

    public void setBusNO(int busNO) {
        this.busNO = busNO;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void displayInformation()
    {
     log.info("BusNo:"+ busNO +" AC:"+ac+" Capacity:"+ capacity);
    }
}
