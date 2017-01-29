package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by lena on 29.01.2017.
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
    public void findMostExpensiveComputerV1( )
    {
        if(checkingItemsInStore()) {
            Date startTime = new Date();
            for (int i = 0; i < computers.size(); i++) {
                if (currentMostExpensive.getTotalCost() > computers.get(i).getTotalCost())
                    currentMostExpensive = currentMostExpensive;
                else {
                    currentMostExpensive = computers.get(i);
                    //return currentMostExpensive;
                }
            }
            Date endTime = new Date();
            long timeToRealiseForLoop = endTime.getTime() - startTime.getTime();
            System.out.println(currentMostExpensive.getComputerSummay() + "Finding the most expensive computer with for loop takes " + timeToRealiseForLoop);
            //return currentMostExpensive;
        }
        else {
            System.out.println("the store is empty");
            //return null;
        }
    }
    /**
     *
     * @return the most expensive computer with a traditional while loop
     */
    public void findMostExpensiveComputerV2( )
    {
        if(checkingItemsInStore()) {
            Date startTime = new Date();
            int index = 0;
            while (index < computers.size()) {
                if (currentMostExpensive.getTotalCost() > computers.get(index).getTotalCost()) {
                    currentMostExpensive = currentMostExpensive;
                    index++;
                } else {
                    currentMostExpensive = computers.get(index);
                    index++;
                    //return currentMostExpensive;
                }
            }
            Date endTime = new Date();
            long timeToRealiseWhileLoop = endTime.getTime() - startTime.getTime();
            System.out.println(currentMostExpensive.getComputerSummay() + ". Finding the most expensive computer with while loop takes " + timeToRealiseWhileLoop);
            //return currentMostExpensive;
        }
        else {
            System.out.println("the store is empty");
            //return null;
        }
    }
    /**
     *
     * @return the most expensive computer with a  for-each loop
     */
    public void findMostExpensiveComputerV3( )
    {
        if(checkingItemsInStore()) {
            Date startTime = new Date();
            for (Computer comp : computers) {
                if (currentMostExpensive.getTotalCost() > comp.getTotalCost())
                    currentMostExpensive = currentMostExpensive;
                else {
                    currentMostExpensive = comp;
                    //return currentMostExpensive;
                }
            }
            Date endTime = new Date();
            long timeToRealiseForEachLoop = endTime.getTime() - startTime.getTime();
            System.out.println(currentMostExpensive.getComputerSummay() + ". Finding the most expensive computer with for-each loop takes " + timeToRealiseForEachLoop);
            //return currentMostExpensive;
        }
        else {
            System.out.println("the store is empty");
            //return null;
        }

    }
    /**
     *
     * @return the most expensive computer with an Iterator object with a while loop
     */
    public void findMostExpensiveComputerV4( ) {
        if (checkingItemsInStore()) {
            Date startTime = new Date();
            Iterator<Computer> it = computers.iterator();
            while (it.hasNext()) {
                Computer comp = it.next();
                if (currentMostExpensive.getTotalCost() > comp.getTotalCost())
                    currentMostExpensive = currentMostExpensive;
                else {
                    currentMostExpensive = comp;
                    //return currentMostExpensive;
                }
            }
            Date endTime = new Date();
            long timeToRealiseIterator = endTime.getTime() - startTime.getTime();
            System.out.println(currentMostExpensive.getComputerSummay() + "Finding the most expensive computer with Iterator takes " + timeToRealiseIterator);
            //return currentMostExpensive;
        }
        else {
            System.out.println("the store is empty");
            //return null;
        }
    }
}
