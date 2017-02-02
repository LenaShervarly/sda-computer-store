package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;


/**
 * Computer Store class provides the possibility to store computers in the collection, 
 * print information about them and finding the most expensive computer within the computer store.
 * 
 * @author Lena Shervarly
 * @version 0.3 (29.01.2017)
 */
public class ComputerStore 
{
    private ArrayList<Computer> computers;
    private Computer currentMostExpensive;
    private ArrayList<Component> components;

    /**
     * Constructor for objects of class ComputerStore. 
     * Gives the possibility to work separately with collection of ready-to-use computers 
     * and a collection of different computer components.
     */
    public ComputerStore()
    {
        computers = new ArrayList<>();
        components = new ArrayList<>();
    }

    /** @return true if adding a new computer to the store was successful and false if not
     *
     */
    public boolean addComputer(Computer newComputer)
    {
        if(newComputer instanceof Computer)
        {
            computers.add(newComputer);
            currentMostExpensive = newComputer;
            return true;
        }
        else
            return false;
    }

    /** @return true if removal of the computer from the store was successful and false if not
     *
     */
    public boolean removeComputer(int index)
    {
        if(index >= 0 && index < computers.size())
        {
            computers.remove(index);
            return true;
        }
        else
            return false;
    }

    /** prints out all the details of each computer in store
     *
     */
    public void printAllComputers( )
    {
        for(Computer eachComp : computers)
            System.out.print(eachComp.getComputerSummay());
    }

    /** prints the total cost for all computers
     *
     */
    public void printTotalValueOfComputers( )
    {
        double totalCostComputers = 0.0;
        for(Computer eachComp : computers)
        {
            eachComp.getTotalCost();
            totalCostComputers += eachComp.getTotalCost();
        }
        System.out.println("The total cost of all computers in the store is " + totalCostComputers + "\n");
    }
    
    /**
     * Method enables to add a new Component to the collection of components within the computer store
     * 
     * @param newComponent represents the component to be added to the collection if it's legal
     */
    public void addComponent(Component newComponent)
    {
        if(newComponent instanceof Component)
           	components.add(newComponent);	
    }
    
    /**
     * Method enables to remove a Component from the collection of components 
     * within the computer store on the base of it's parameter (index)
     * 
     * @param index represents the index within the collection of the components, 
     * indicating the element to be removed (if index is legal) 
     */
    public void removeComponent(int index)
    {
    	if(index >= 0 && index < components.size())
    		components.remove(index);
    	else
    		throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
    }
    
    /**
    *
    * @return the total cost of all the components within the collection
    */
   public double totalCostOfComponents( )
   {
   	double totalCostOfComponents = 0.0;
   	for(Component component : components)
       {
           totalCostOfComponents += component.getCost();
       }
       return totalCostOfComponents;
   }
   
   /**
   *
   * @return the total cost of all the components of a specified type (from the parameter) within the collection,
   * if the specified type is legal
   * @param component_type - specifies the type of the component, for example "Display", 
   *  whose total Cost you would like to know.
 * @throws ClassNotFoundException 
 * @throws IllegalAccessException 
 * @throws InstantiationException 
   */
   public double totalCostOfComponents(String component_type) throws ClassNotFoundException, InstantiationException, IllegalAccessException
   {
	   double totalCostOfComponents = 0.0;
	   Class<?> checkingClass = Class.forName(component_type);
	   
       for(Component component : components)
       { 	   
    	   if(checkingClass.isInstance(component))
	           totalCostOfComponents += component.getCost();
       }
       return totalCostOfComponents;
       
   }
   
   /**
     * @return true if the collection of computers is not empty
     */
    public boolean checkingItemsInStore()
    {
        if(computers.size()>0)
            return true;
        else
        {
            System.out.println("the store is empty");
            return false;
        }
    }
    
    /**
     *
     * @return the most expensive computer with a traditional for loop
     */
    public Computer findMostExpensiveComputerV1()
    {
        if(checkingItemsInStore()) {
            Date startTime = new Date();
            for (int i = 0; i < computers.size(); i++) {
                return (currentMostExpensive.getTotalCost() > computers.get(i).getTotalCost()) ? currentMostExpensive : computers.get(i);
            }
            Date endTime = new Date();
            long timeToRealiseForLoop = endTime.getTime() - startTime.getTime();

            System.out.println(currentMostExpensive.getComputerSummay() +
                    ". Finding the most expensive computer with for loop takes " + timeToRealiseForLoop);
            return currentMostExpensive;
        }
        else {
            System.out.println("the store is empty");
            return null;
        }
    }
    
    /**
     *
     * @return the most expensive computer with a traditional while loop
     */
    public Computer findMostExpensiveComputerV2()
    {
        if(checkingItemsInStore()) {
            Date startTime = new Date();
            int index = 0;
            while (index < computers.size()) {
                if (currentMostExpensive.getTotalCost() > computers.get(index).getTotalCost()) {
                    index++;
                    return currentMostExpensive;
                } else {
                    currentMostExpensive = computers.get(index);
                    index++;
                    return currentMostExpensive;
                }
            }
            Date endTime = new Date();
            long timeToRealiseWhileLoop = endTime.getTime() - startTime.getTime();

            System.out.println(currentMostExpensive.getComputerSummay() +
                    ". Finding the most expensive computer with while loop takes " + timeToRealiseWhileLoop);
            return currentMostExpensive;
        }
        else {
            System.out.println("the store is empty");
            return null;
        }
    }
    
    /**
     *
     * @return the most expensive computer with a for-each loop
     */
    public Computer findMostExpensiveComputerV3()
    {
        if(checkingItemsInStore()) {
            Date startTime = new Date();
            for (Computer comp : computers) {
                return (currentMostExpensive.getTotalCost() > comp.getTotalCost()) ? currentMostExpensive : comp;
            }
            Date endTime = new Date();
            long timeToRealiseForEachLoop = endTime.getTime() - startTime.getTime();

            System.out.println(currentMostExpensive.getComputerSummay() +
                    ". Finding the most expensive computer with for-each loop takes " + timeToRealiseForEachLoop);
            return currentMostExpensive;
        }
        else {
            System.out.println("the store is empty");
            return null;
        }
    }
    
    /**
     *
     * @return the most expensive computer with an Iterator object with a while loop
     * ## I suggest this method being the most effective for future development of the shop.
     * For 3 computers in the store all searching options providing the results really fast.
     * However, considering future development and possibility of using different collection type,
     * this method will accurately and quickly work in any case. ##
     */
    public Computer findMostExpensiveComputerV4() 
    {
        if (checkingItemsInStore()) {
            Date startTime = new Date();
            Iterator<Computer> it = computers.iterator();
            while (it.hasNext()) {
                Computer comp = it.next();
                return  (currentMostExpensive.getTotalCost() > comp.getTotalCost()) ? currentMostExpensive : comp;
            }
            Date endTime = new Date();
            long timeToRealiseIterator = endTime.getTime() - startTime.getTime();

            System.out.println(currentMostExpensive.getComputerSummay() +
                    ". Finding the most expensive computer with Iterator takes " + timeToRealiseIterator);
            return currentMostExpensive;
        }
        else {
            System.out.println("the store is empty");
            return null;
        }
    }
}
