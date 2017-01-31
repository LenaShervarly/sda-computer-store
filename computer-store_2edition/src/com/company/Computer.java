package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Class Computer.
 * Its role is to store other objects that model the components of a computer.
 * 
 * @author Lena Shervarly
 * @version 0.3 (31.01.2017)
 *
 * 
 */
public class Computer 
{

    private HashMap<String, Component> configuration;

    /**Constructor for Computer. Creates the default computer with the possibility to change it configuration further
     *
     */
    public Computer() 
    {
        configuration = new HashMap<>();
    }
    
    /**
     * Method enables to add a Component to the collection of components of the computer
     * 
     * @param name specifies the name of the component
     * @param newComponent represents the component itself to be added to the collection
     */
    public void addComponent(String name, Component newComponent)
    {
        configuration.put(name, newComponent);
    }
    
    /**
     * Method enables to remove a Component from the collection on the base of it's keyValue (parameter)
     * 
     * @param name represents the keyValue to the HashMap configuration. 
     */
    public void removeComponent(String name)
    {
    	configuration.remove(name);
    }
    
    /**
     * @return all the information regarding the Computer components
     */
    public String getComputerSummay()
    {
        String computerSummary = "The computer consists of: ";
        for(Map.Entry<String, Component> entry : configuration.entrySet())
        	computerSummary += "\n" + entry.getKey() + entry.getValue().getDescription();
        
        computerSummary += "\n" + "The total cost of the computer is " + getTotalCost();
        return computerSummary;
    }
    
    /**
     * Prints the Summary of the Computer components with a total cost
     */
    public void printComputerSummary() 
    {
        System.out.println(getComputerSummay());
    }
    
    /**
     * @return a total cost of the Computer components in SEK
     */
    public double getTotalCost()
    {
    	double totalCost = 0.00;
    	for(Map.Entry<String, Component> entry : configuration.entrySet())
    		totalCost += entry.getValue().getCost();
    	 
        return totalCost;
    }
}
