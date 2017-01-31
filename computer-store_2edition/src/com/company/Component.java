package com.company;

import java.util.ArrayList;

/**
 * Class Component responds for the collection of spare parts that can be further being sold to customers 
 *  
 * @author Lena Shervarly
 * @version 0.3 (31.01.2017)
 */
public class Component 
{
    private String manufacturer;
    private double cost;

    /**
     * @return a total cost of the Component in SEK
     */
    public double getCost()
    {
        return cost;
    }
    
    /**
     * Method was created for further usage by subclasses
     * 
     * @return a general description of a component. 
     */
    public String getDescription()
    {
        return "General Description";
    }
    
    /**
     * @return a name of the Manufacturer of the Component
     */
    public String getManufacturer()
    {
    	return manufacturer;
    }
    
    /**
     * Methods sets (or changes) the name of the manufacturer of the Component
     * 
     * @param newManufacturer represents the name of the Manufacturer
     */
    public void setManufacturer(String newManufacturer)
    {
        if(newManufacturer != null)
            manufacturer = newManufacturer;
        else
            throw new IllegalArgumentException("Type the name of the Manufacturer");
    }
    
    /**
     * Method sets a total cost of the Component in SEK
     * 
     * @param updatedCost represents the value of the new cost of the Component
     */
    public void setCost(double updatedCost)
    {
        if(updatedCost > 1.00)
            cost = updatedCost;
        else
            throw new IllegalArgumentException(updatedCost + " out of range. Must be > 1.00");
    }
}
