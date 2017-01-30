package com.company;


import java.util.HashMap;

/**
 * Created by elena on 28.01.2017.
 *
 * Class Computer.
 * Its role is to store other objects that model the components of a computer.
 */
public class Computer {

    private HashMap<String, Component> configuration;
    private String computerSummary;

    /**Constructor for Computer. Creates the default computer with default Processor, Hard Disk and Display
     *
     */
    public Computer() {
        configuration = new HashMap<>();
    }
    public void setProcessor(String typeProcessor, Processor newProcessor)
    {
        configuration.put(typeProcessor, newProcessor);
    }
    public void setHardDisk(String typeHardDisk, HardDisk newHardDisk)
    {
        configuration.put(typeHardDisk, newHardDisk);
    }
    public void setDisplay(String typeDisplay, Display newDisplay)
    {
        configuration.put(typeDisplay, newDisplay);
    }
    /**
     * @return all the information regarding the Computer components
     */
    public String getComputerSummay()
    {
        computerSummary = "The computer consists of: " + "\n" + configuration.toString() + "\n" + "The total cost of the computer is " + getTotalCost();
        return computerSummary;
    }
    /**
     * Prints the Summary of the Computer components with a total cost
     */
    public void printComputerSummary() {
        System.out.println(getComputerSummay());
    }
    /**
     * @return a total cost of the Computer components in SEK
     */
    public double getTotalCost()
    {
        double totalCost = 0.0; // = theProcessor.getCost() + theDisplay.getCost() + theHardDisk.getCost();
        return totalCost;
    }
}
