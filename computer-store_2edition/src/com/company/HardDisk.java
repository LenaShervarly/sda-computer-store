package com.company;

import java.math.RoundingMode;


/**
 * Created by elena on 28.01.2017.
 * Class HardDrive stores information about Hard Drive of the computer.
 */
public class HardDisk {
    private int storageSpace;
    private int writeSpeed;
    private String manufacturer;
    private double cost;

    /** Constructor for HardDrive. Automatically initialize the fields of HardDrive with the default values.
     */
    public HardDisk()
    {
        storageSpace = 1000;
        writeSpeed = 3;
        manufacturer = "WD Scorpio Blue";
        cost = 689.00;
    }
    /** Constructor for HardDrive. Initialize the fields of HardDrive with the given values:
     @param storageSpace keeps Storage Space of the Hard Disk in GB;
     @param writeSpeed keeps Writing Speed of the Hard Disk in GB per second;
     @param manufacturer keeps the name of Hard Drives manufacturer;
     @param cost keep the total cost of the Hard Drive in SEK (precise the number within the quotes " ").
     */
    public HardDisk(int storageSpace, int writeSpeed, String manufacturer, double cost)
    {
        this.storageSpace = storageSpace;
        this.writeSpeed = writeSpeed;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }
    /**
     * @return a total Storage Space of the Hard Disk in GB
     */
    public int getStorageSpace() { return storageSpace; }
    /**
     * @return a Writing Speed of the Hard Disk in GB per second;
     */
    public int getWriteSpeed() { return writeSpeed; }
    public String getManufacturer() { return manufacturer; }
    /**
     * @return a total cost of the Hard Disk in SEK
     */
    public double getCost()
    {
        return cost;
    }

    /**
     *
     * @param updatedStorageSpace sets Storage Space of the Hard Disk in GB
     */
    public void setStorageSpace(int updatedStorageSpace)
    {
        if(updatedStorageSpace > 0)
            storageSpace = updatedStorageSpace;
        else
            throw new IllegalArgumentException(updatedStorageSpace + " out of range. Must be in the range 1 ...");
    }
    /**
     *
     * @param updatedWriteSpeed sets Writing Speed of the Hard Disk in GB per second
     */
    public void setWriteSpeeds(int updatedWriteSpeed)
    {
        if(updatedWriteSpeed > 0)
            writeSpeed = updatedWriteSpeed;
        else
            throw new IllegalArgumentException(updatedWriteSpeed  + " out of range. Must be in the range 1 ...");
    }
    public void setManufacturer(String newManufacturer)
    {
        if(newManufacturer != null)
            manufacturer = newManufacturer;
        else
            throw new IllegalArgumentException("Type the name of the Manufacturer");
    }

    /**
     *
     * @param updatedCost sets the total cost of the Hard Drive in SEK
     * Please, precise the number within the quotes " " using the next expression: new BigDecimal("   ")
     */
    public void setCost(double updatedCost)
    {
        if(updatedCost > 1)
            cost = updatedCost;
        else
            throw new IllegalArgumentException(updatedCost + " out of range. Must be in the range 1 ...");
    }
    public String getSummary()
    {
        return "- the Hard Disk: the manufacturer of this Hard Disk is " + getManufacturer() + ", the storage space is " + getStorageSpace() + ", the write speed is " + getWriteSpeed()  + ", the cost of the display is " + getCost()+ "\n";
    }
}
