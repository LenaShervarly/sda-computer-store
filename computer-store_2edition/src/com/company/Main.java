package com.company;

public class Main {

    public static void main(String[] args) {

    	// create a default basic configuration
    	Computer myPC = new Computer();

    	// Add a hard disk   
    	Component hdd1 = new HardDisk(1000, 3, "Seagate", 790.50);
    	myPC.addComponent("hard disk 1", hdd1);

    	// Add a second hard disk
    	Component hdd2 = new HardDisk(1500, 2, "Seagate", 640.69);
    	myPC.addComponent("hard disk 2", hdd2);
    }
}
