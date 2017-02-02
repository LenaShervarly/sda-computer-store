package com.company;

import java.math.RoundingMode;


/**
 * Class HardDrive stores information about Hard Drive of the computer.
 *
 * @author Lena Shervarly
 * @version 0.3 (28.01.2017)
 */
public class HardDisk extends Component
{
    private int storageSpace;
    private int writeSpeed;

    /** Constructor for HardDrive. Automatically initialize the fields of HardDrive with the default values.
     */
    public HardDisk()
    {
        storageSpace = 1000;
        writeSpeed = 3;
        setManufacturer("WD Scorpio Blue");
        setCost(689.00);
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
        setManufacturer(manufacturer);
        setCost(cost);
    }

    /**
     * @return a total Storage Space of the Hard Disk in GB
     */
    public int getStorageSpace() { return storageSpace; }

    /**
     * @return a Writing Speed of the Hard Disk in GB per second;
     */
    public int getWriteSpeed() { return writeSpeed; }

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

    @Override
    public String getDescription()
    {
        return super.getDescription() + "- the Hard Disk: the manufacturer of this Hard Disk is " + getManufacturer() + ", the storage space is " + getStorageSpace() + ", the write speed is " + getWriteSpeed()  + ", the cost of the display is " + getCost()+ "\n";
    }
}
