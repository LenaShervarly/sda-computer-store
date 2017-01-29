package com.company;

import java.math.BigDecimal;

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

    // constructor for Computer
    // takes no parameters
    // it call the constructor of each of the fields
    public Computer() {
        theProcessor = new Processor();
        theHardDisk = new HardDisk();
        theDisplay = new Display();
    }
    public void addProcessor(Processor newProcessor)
    {
        theProcessor = newProcessor;
    }
    public void addHardDisk(HardDisk newHardDisk)
    {
        theHardDisk = newHardDisk;
    }
    public void addDisplay(Display newDisplay)
    {
        theDisplay = newDisplay;
    }

    // print a summary of the Computer components and calculate a total cost
    // you will need method calls to get info about the other components
    // e.g. theProcessor.getCost()
    public void printComputerSummary() {
        System.out.println("The computer consists of: " + "\n" + theProcessor.getSummary() + theHardDisk.getSummary() + theDisplay.getSummary() + "\n" + "The total cost of the computer is " + totalCost());
    }
    public BigDecimal totalCost()
    {
        BigDecimal totalCost = theProcessor.getCost().add(theDisplay.getCost()).add(theHardDisk.getCost());
        return totalCost;
    }
}
