package com.company;

import java.security.InvalidParameterException;

/**
 * Created by elena on 28.01.2017.
 */
public class Display extends Component {
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
    public String getManufacturer() { return manufacturer; }
    /**
     * @return a total cost of the Display in SEK
     */
    public double getCost()
    {
        return cost;
    }
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
    public void setManufacturer(String newManufacturer)
    {
        if(newManufacturer != null)
            manufacturer = newManufacturer;
        else
            throw new IllegalArgumentException("Type the name of the Manufacturer");
    }
    /**
     *
     * @param updatedCost sets a total cost of the Display in SEK
     */
    public void setCost(double updatedCost)
    {
        if(updatedCost > 1)
            cost = updatedCost;
        else
            throw new IllegalArgumentException(updatedCost + " out of range. Must be in the range 1 ...");
    }

    public String getDescription()
    {
        return "- the Display: the manufacturer of this Display is " + getManufacturer() + ", the screen diagonal is " + getScreenDiagonal() + ", the cost of the display is " + getCost()+ "\n";
    }

}
