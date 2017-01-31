package com.company;

import java.security.InvalidParameterException;

/**
 * Class HardDrive stores information about Hard Drive of the computer.
 * 
 * @author Lena Shervarly
 * @version 0.3 (28.01.2017)
 */
public class Processor extends Component
{
    private double clockspeed;
    
    /** Constructor for Processor. Automatically initialize the fields of Processor with the default values.
     */
    public Processor()
    {
        clockspeed = 1.8;
        setManufacturer("Intel");
        setCost(3000.00);
    }
    
    /** Constructor for Processor. Automatically initialize the fields of Processor with the given values:
     @param manufacturer keeps the name of Processor manufacturer;
     @param clockspeed keeps the clock speed of the Processor in Ghz;
     @param cost keep the total cost of the Processor in SEK (precise the number within the quotes " ").
     */
    public Processor(String manufacturer, double clockspeed, double cost)
    {
        setManufacturer(manufacturer);
        this.clockspeed = clockspeed;
        setCost(cost);
    }
   
    /**
     *
     * @return a clock speed of the Processor in Ghz
     */
    public double getClockspeed()
    {
        return clockspeed;
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
    
    @Override 
    public String getDescription()
    {
        return "- the Processor: the manufacturer of this Processor is " + getManufacturer() + ", the clock speed is " + getClockspeed() + ", the cost of the processor is " + getCost() + "\n";
    }
}
