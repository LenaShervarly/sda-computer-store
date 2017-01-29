package com.company;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

/**
 * Created by elena on 28.01.2017.
 */
public class Display {
    private int screenDiagonal;
    private String manufacturer;
    private BigDecimal cost;

    /** Constructor for Display. Automatically initialize the fields of Display with the default values.
     */
    public Display()
    {
        screenDiagonal = 27;
        manufacturer = "Dell";
        cost =  new BigDecimal("4500");
    }

    /** Constructor for Display. Automatically initialize the fields of Display with the given values.
     @param screenDiagonal keeps the value of Displays diagonal in inches;
     @param manufacturer keeps the name of Processor manufacturer;
     @param cost keep the total cost of the Processor in SEK (precise the number within the quotes " ").
     */
    public Display(int screenDiagonal, String manufacturer, BigDecimal cost)
    {
        this.screenDiagonal = screenDiagonal;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }
    public int getScreenDiagonal() {return screenDiagonal; }
    public String getManufacturer() { return manufacturer; }
    public BigDecimal getCost()
    {
        return cost;
    }

    public void setScreenDiagonal(int newScreenDiagonal)
    {
        if(newScreenDiagonal > 10)
            screenDiagonal = newScreenDiagonal;
        else
            throw new IllegalArgumentException(newScreenDiagonal + " out of range. Must be in the range 10 ... ");
    }
    public void setManufacturer(String newManufacturer)
    {
        if(newManufacturer != null)
            manufacturer = newManufacturer;
        else
            throw new IllegalArgumentException("Type the name of the Manufacturer");

    }
    public void setCost(BigDecimal updatedCost)
    {
        if(updatedCost.intValue() > 1)
            cost = updatedCost;
        else
            throw new IllegalArgumentException(updatedCost + " out of range. Must be in the range 1 ...");
    }

    public String getSummary()
    {
        return "- the Display: the manufacturer of this Display is " + getManufacturer() + ", the screen diagonal is " + getScreenDiagonal() + ", the cost of the display is " + getCost()+ "\n";
    }

}
