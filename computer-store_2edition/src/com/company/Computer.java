package com.company;


/**
 * Created by elena on 28.01.2017.
 *
 * Class Computer.
 * Its role is to store other objects that model the components of a computer.
 */
public class Computer {

    private Processor theProcessor;
    private HardDisk theHardDisk;
    private Display theDisplay;
    private String computerSummary;

    /**Constructor for Computer. Creates the default computer with default Processor, Hard Disk and Display
     *
     */
    public Computer() {
        theProcessor = new Processor();
        theHardDisk = new HardDisk();
        theDisplay = new Display();
    }
    public void setProcessor(Processor newProcessor)
    {
        theProcessor = newProcessor;
    }
    public void setHardDisk(HardDisk newHardDisk)
    {
        theHardDisk = newHardDisk;
    }
    public void setDisplay(Display newDisplay)
    {
        theDisplay = newDisplay;
    }
    /**
     * @return all the information regarding the Computer components
     */
    public String getComputerSummay()
    {
        computerSummary = "The computer consists of: " + "\n" + theProcessor.getSummary() + theHardDisk.getSummary() +
                theDisplay.getSummary() + "\n" + "The total cost of the computer is " + getTotalCost();
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
        double totalCost = theProcessor.getCost() + theDisplay.getCost() + theHardDisk.getCost();
        return totalCost;
    }
}
