package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by lena on 29.01.2017.
 * Computer Store class provides the possibility to store computers in the collection, print information about them and finding the most expensive computer within the computer store.
 */
public class ComputerStore {
    private ArrayList<Computer> computers;
    private Computer currentMostExpensive;

    public ComputerStore()
    {
        computers = new ArrayList<>();
    }

    /** @return true if adding a new computer to the store was successful and false if not
     *
     */
    public boolean addComputer(Computer newComputer)
    {
        if(newComputer != null)
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
    public void printTotalValue( )
    {
        double totalCost = 0.0;
        for(Computer eachComp : computers)
        {
            eachComp.getTotalCost();
            totalCost += eachComp.getTotalCost();
        }
        System.out.println("The total cost of all computers in the store is " + totalCost + "\n");
    }

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
    public Computer findMostExpensiveComputerV1( )
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
    public Computer findMostExpensiveComputerV2( )
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
     * @return the most expensive computer with a  for-each loop
     */
    public Computer findMostExpensiveComputerV3( )
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
    public Computer findMostExpensiveComputerV4( ) {
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
