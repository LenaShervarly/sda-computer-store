package com.company;

public class Main {

    public static void main(String[] args) {

        Processor processorAMD = new Processor("AMD", 2.0, 4500.00);
        //processorAMD.setCost(4500.0);

        Processor processorIntel = new Processor("Intel", 1.6, 1500.00);
        //processorIntel.setCost(1500.0);

        Computer comp1 = new Computer();
        //comp1.printComputerSummary();

        Computer comp2 = new Computer();
        comp2.setProcessor(processorAMD);
        //comp2.printComputerSummary();

        Computer comp3 = new Computer();
        comp3.setProcessor(processorIntel);
        //comp3.printComputerSummary();

        ComputerStore computerStore = new ComputerStore();
        computerStore.addComputer(comp1);
        computerStore.addComputer(comp2);
        computerStore.addComputer(comp3);

        for(int i = 0; i < 10000; i ++)
        {
            Computer computer = new Computer();
            computerStore.addComputer(computer);
        }

        computerStore.findMostExpensiveComputerV1();
        computerStore.findMostExpensiveComputerV2();
        computerStore.findMostExpensiveComputerV3();
        computerStore.findMostExpensiveComputerV4();
    }
}
