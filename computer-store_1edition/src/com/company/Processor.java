package com.company;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

/**
 * Created by elena on 28.01.2017.
 */
public class Processor {
    private String manufacturer;
    private double clockspeed;
    private BigDecimal cost;

    /** Constructor for Processor. Automatically initialize the fields of Processor with the default values.
     */
    public Processor()
    {
        manufacturer = "Intel";
        clockspeed = 1.8;
        cost =  new BigDecimal("3000");
    }
    /** Constructor for Processor. Automatically initialize the fields of Processor with the given values:
     @param manufacturer keeps the name of Processor manufacturer;
     @param clockspeed keeps the clock speed of the Processor in Ghz;
     @param cost keep the total cost of the Processor in SEK (precise the number within the quotes " ").
     */
    public Processor(String manufacturer, double clockspeed, BigDecimal cost)
    {
        this.manufacturer = manufacturer;
        this.clockspeed = clockspeed;
        this.cost = cost;
    }

    public String getManufacturer() { return manufacturer; }
    public double getClockspeed()
    {
        return clockspeed;
    }
    public BigDecimal getCost()
    {
        return cost;
    }

    public void setManufacturer(String newManufacturer)
    {
        if(newManufacturer != null)
            manufacturer = newManufacturer;
        else
            throw new IllegalArgumentException("Type the name of the Manufacturer");

    }
    public void setClockspeed(double updatedClockspeed)
    {
        if(updatedClockspeed > 0)
            clockspeed = updatedClockspeed;
        else
            throw new IllegalArgumentException(updatedClockspeed + " out of range. Must be in the range 1 ...");
    }
    public void setCost(BigDecimal updatedCost)
    {
        if(updatedCost.intValue() >= 1)
            cost = updatedCost;
        else
            throw new IllegalArgumentException(updatedCost + " out of range. Must be in the range 1 ...");
    }
    public String getSummary()
    {
        return "- the Processor: the manufacturer of this Processor is " + getManufacturer() + ", the clock speed is " + getClockspeed() + ", the cost of the processor is " + getCost() + "\n";
    }
}
