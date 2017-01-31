package com.company;

import java.security.InvalidParameterException;

/**
 * The class stores information regarding Displays
 * 
 * @author Lena Shervarly
 * @version 0.3 (28.01.2017)
 */
public class Display extends Component 
{
    private int screenDiagonal;
    private String manufacturer;
    private double cost;

    /** Constructor for Display. Automatically initialize the fields of Display with the default values.
     */
    public Display()
    {
        screenDiagonal = 27;
        manufacturer = "Dell";
        cost =  4500.0;
    }

    /** Constructor for Display. Automatically initialize the fields of Display with the given values.
     @param screenDiagonal keeps the value of Displays diagonal in inches;
     @param manufacturer keeps the name of Processor manufacturer;
     @param cost keep the total cost of the Processor in SEK (precise the number within the quotes " ").
     */
    public Display(int screenDiagonal, String manufacturer, double cost)
    {
        this.screenDiagonal = screenDiagonal;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }
    
    /**
     * @return a size of Screen Diagonal of the Display in inches
     */
    public int getScreenDiagonal() {return screenDiagonal; }
    
    /**
     *
     * @param newScreenDiagonal sets a size of Screen Diagonal of the Display in inches
     */
    public void setScreenDiagonal(int newScreenDiagonal)
    {
        if(newScreenDiagonal > 10)
            screenDiagonal = newScreenDiagonal;
        else
            throw new IllegalArgumentException(newScreenDiagonal + " out of range. Must be in the range 10 ... ");
    }
    
    @Override
    public String getDescription()
    {
        return "- the Display: the manufacturer of this Display is " + getManufacturer() + ", the screen diagonal is " + getScreenDiagonal() + ", the cost of the display is " + getCost()+ "\n";
    }

}
