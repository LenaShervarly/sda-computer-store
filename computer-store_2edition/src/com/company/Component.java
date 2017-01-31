package com.company;

import java.util.ArrayList;

/**
 * Created by elena on 30.01.2017.
 */
public class Component {
    private String manufacturer;
    private double cost;

    /**
     * @return a total cost in SEK
     */
    public double getCost()
    {
        return cost;
    }
    public String getDescription()
    {
        return " ";
    }
    private ArrayList<Component> components = new ArrayList<>();
    private int totalCostOfComponents = 0;

    /**
     *
     * @return the total cost of all the components within the collection
     */
    public int totalCostOfComponents( )
    {
        for(Component component : components)
        {
            totalCostOfComponents += component.getCost();
        }
        return totalCostOfComponents;
        dgfgsgs
        
        ff
    }
    public int totalCostOfComponents(Component component_type)
    {
        totalCostOfComponents = 0;
        if(component_type instanceof Processor)
            totalCostOfComponents += component_type.getCost();
        if(component_type instanceof Display)
            totalCostOfComponents += component_type.getCost();
        if(component_type instanceof HardDisk)
            totalCostOfComponents += component_type.getCost();

        return totalCostOfComponents;
    }
}
