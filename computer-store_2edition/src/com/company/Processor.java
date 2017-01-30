package com.company;

import java.security.InvalidParameterException;

/**
 * Created by elena on 28.01.2017.
 */
public class Processor extends Component{
    private String manufacturer;
    private double clockspeed;
    private double cost;

    /** Constructor for Processor. Automatically initialize the fields of Processor with the default values.
     */
    public Processor()
    {
        manufacturer = "Intel";
        clockspeed = 1.8;
        cost =  3000.0;
    }
    /** Constructor for Processor. Automatically initialize the fields of Processor with the given values:
     @param manufacturer keeps the name of Processor manufacturer;
     @param clockspeed keeps the clock speed of the Processor in Ghz;
     @param cost keep the total cost of the Processor in SEK (precise the number within the quotes " ").
     */
    public Processor(String manufacturer, double clockspeed, double cost)
    {
        this.manufacturer = manufacturer;
        this.clockspeed = clockspeed;
        this.cost = cost;
    }
    public String getManufacturer() { return manufacturer; }
    /**
     *
     * @return a clock speed of the Processor in Ghz
     */
    public double getClockspeed()
    {
        return clockspeed;
    }
    /**
     * @return a total cost of the Processor in SEK
     */
    public double getCost()
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
    /**
     *
     * @param updatedClockspeed sets a clock speed of the Processor in Ghz
     */
    public void setClockspeed(double updatedClockspeed)
    {
        if(updatedClockspeed > 0)
            clockspeed = updatedClockspeed;
        else
            throw new IllegalArgumentException(updatedClockspeed + " out of range. Must be in the range 1 ...");
    }
    /**
     *
     * @param updatedCost sets a total cost of the Processor in SEK
     *
     */
    public void setCost(double updatedCost)
    {
        if(updatedCost >= 1)
            cost = updatedCost;
        else
            throw new IllegalArgumentException(updatedCost + " out of range. Must be in the range 1 ...");
    }
    public String getDescription()
    {
        return "- the Processor: the manufacturer of this Processor is " + getManufacturer() + ", the clock speed is " + getClockspeed() + ", the cost of the processor is " + getCost() + "\n";
    }
}
