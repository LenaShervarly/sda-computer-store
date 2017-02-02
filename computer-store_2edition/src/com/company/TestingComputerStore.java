package com.company;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestingComputerStore {

    ComputerStore computerStore;
    Computer myPC1;
    Computer myPC2;
    Component hdd1;
    Component hdd2;
    Component disp;
    Component pros;
    String HardDisk;
    String Display;
    String Processor;

    @Before
    public void setUp() throws Exception {
        computerStore = new ComputerStore();
        myPC1 = new Computer();
        myPC2 = new Computer();
        hdd1 = new HardDisk(1000, 3, "Seagate", 790.50);
        hdd2 = new HardDisk(1500, 2, "Seagate", 640.69);
        disp = new Display(27, "Dell", 1500.00);
        pros = new Processor("Intel", 1.8, 2500.00);
        myPC1.addComponent("Hard Disk", hdd1);
        myPC1.addComponent("DisplayM", disp);
        myPC1.addComponent("Processor", pros);
        
        HardDisk = "com.company.HardDisk";
        Display = "com.company.Display";
        Processor = "com.company.Processor";
        
        
        computerStore.addComponent(hdd1);
        computerStore.addComponent(hdd2);
        computerStore.addComponent(disp);
        computerStore.addComponent(pros);
        
        computerStore.addComputer(myPC1);  
    	computerStore.addComputer(myPC2);
    	
    	for(int i = 0; i < 10000; i ++)
        {
            Computer computer = new Computer();
            computerStore.addComputer(computer);
        }
    }

    @Test
    public void testAddComputer() {
        assertTrue(computerStore.addComputer(myPC1));
        assertTrue(computerStore.addComputer(myPC2));
    }
    
    @Test
    public void testRemoveComputerPositive() {
    	assertTrue(computerStore.removeComputer(0));
        assertTrue(computerStore.removeComputer(0));
    }
    
    @Test
    public void testRemoveComputerNegative() {
           assertFalse(computerStore.removeComputer(10003));
           assertFalse(computerStore.removeComputer(-1));
           assertFalse(computerStore.removeComputer(10004));
    }
    @Test
    public void testTotalCostOfComponentsWithoutParameter() {
        assertEquals(5431.19, computerStore.totalCostOfComponents(), 0.5);
    }
    
    @Test
    public void testTotalCostOfComponentsWithParameter() throws Exception {
        assertEquals(1431.19, computerStore.totalCostOfComponents(HardDisk), 0.1);
        assertEquals(1500.00, computerStore.totalCostOfComponents(Display), 0.1);
        assertEquals(2500.00, computerStore.totalCostOfComponents(Processor), 0.1);
    }
    
    @Test
    public void testFindMostExpensiveComputerV1() {
    	
    	assertEquals(myPC1, computerStore.findMostExpensiveComputerV1());
    }
    
    @Test
    public void testFindMostExpensiveComputerV2() {
    	
    	assertEquals(myPC1, computerStore.findMostExpensiveComputerV1());
    }
    @Test
    public void testFindMostExpensiveComputerV3() {
    	
    	assertEquals(myPC1, computerStore.findMostExpensiveComputerV1());
    }
    @Test
    public void testFindMostExpensiveComputerV4() {
    	
    	assertEquals(myPC1, computerStore.findMostExpensiveComputerV1());
    }

}

