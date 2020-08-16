package machine;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Machine m = new Machine();
        while (scanner.hasNext()) {
            m.makeSomeAction(scanner.nextLine());
        }
    }

}

class Machine {
    static CoffeeEspresso coffEespresso;
    static CoffeeLatte coffeLatte;
    static CoffeeCappuccino coffeCappuccino;
    private int machineWater       ; //ml
    private int machineMilk       ; //ml
    private int machineCofeeBeans  ; //grams
    private int disposableCups ;
    private int amountOfMonney ;


    enum CoffeeMachineState {
        INITIAL, //take,remaining.exit
        BUY,
        FILL,
        FILLING_WATER,
        FILLING_MILK,
        FILLING_COFFE_B,
        FILLING_CUPS
        ;

        static CoffeeMachineState state ;

        static void setCurrentState (CoffeeMachineState machineState) {
            state = machineState;

        }

        static CoffeeMachineState getCurrentState () {
            return state;
        }

    }

    public Machine() {
        final Machine m = new Machine(400, 540, 120, 9, 550);
        this.machineWater           = m.getWater();
        this.machineMilk            = m.getMilk();
        this.machineCofeeBeans      = m.getCofeeBeans();
        this.disposableCups         = m.getDisposableCups();
        this.amountOfMonney         = m.getAmountOfMonney();
        CoffeeMachineState.setCurrentState(CoffeeMachineState.INITIAL);
    }

    public Machine(int machineWater, int machineMilk, int machineCofeeBeans, int disposableCups, int amountOfMonney) {
        this.coffEespresso = new CoffeeEspresso();
        this.coffeLatte = new CoffeeLatte();
        this.coffeCappuccino = new CoffeeCappuccino();

        this.machineWater = machineWater;
        this.machineMilk = machineMilk;
        this.machineCofeeBeans = machineCofeeBeans;
        this.disposableCups = disposableCups;
        this.amountOfMonney = amountOfMonney;
        CoffeeMachineState.setCurrentState(CoffeeMachineState.INITIAL);
    }



    public void setMachineWater(int machineWater) {
        if (machineWater <= 0) {
            this.machineWater = 0;
        } else {
            this.machineWater = machineWater; }
    }

    public void setMachineMilk(int machineMilk) {
        if (machineMilk <= 0) {
            this.machineMilk = 0;
        } else {
            this.machineMilk = machineMilk; }
    }

    public void setMachineCofeeBeans(int machineCofeeBeans) {
        if (machineCofeeBeans <= 0) {
            this.machineCofeeBeans = 0;
        } else {
            this.machineCofeeBeans = machineCofeeBeans;
        }
    }

    public void setDisposableCups(int disposableCups) {
        if (disposableCups <= 0) {
            this.disposableCups = 0;
        } else {
            this.disposableCups = disposableCups;
        }
    }

    public void setAmountOfMonney(int amountOfMonney) {
        if (disposableCups <= 0) {
            this.disposableCups = 0;
        } else {
            this.amountOfMonney = amountOfMonney;
        }
    }

    public int getWater() {
        return machineWater;
    }

    public int getMilk() {
        return machineMilk;
    }

    public int getCofeeBeans() {
        return machineCofeeBeans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }
    public int getAmountOfMonney() {
        return amountOfMonney;
    }

    public interface Coffee {
        public int getWater();
        public int getMilk() ;
        public int getCofeeBeans() ;

    }

    class CoffeeEspresso implements Coffee {
        final int water = 250; //ml
        final int milk = 0; //ml
        final int cofeeBeans = 16; //grams
        final int cost = 4;

        @Override
        public int getWater() {
            return water;        }
        @Override
        public int getMilk() {
            return milk;        }
        @Override
        public int getCofeeBeans() {
            return cofeeBeans;
        }

    }

    class CoffeeLatte implements Coffee {
        final int water = 350; //ml
        final int milk = 75; //ml
        final int cofeeBeans = 20; //grams
        final int cost = 7;
        @Override
        public int getWater() {
            return water;        }
        @Override
        public int getMilk() {
            return milk;        }
        @Override
        public int getCofeeBeans() {
            return cofeeBeans;
        }

    }

    class CoffeeCappuccino implements Coffee {
        final int water = 200; //ml
        final int milk = 100; //ml
        final int cofeeBeans = 12; //grams
        final int cost = 6;
        @Override
        public int getWater() {
            return water;        }
        @Override
        public int getMilk() {
            return milk;        }
        @Override
        public int getCofeeBeans() {
            return cofeeBeans;
        }

    }


    public void makeSomeAction(String action) {
        CoffeeMachineState option = CoffeeMachineState.getCurrentState();
        switch (option) {
            case INITIAL: {
                if (action.equals("buy")) {
                    Machine.CoffeeMachineState.setCurrentState(Machine.CoffeeMachineState.BUY);
                    break;
                }
                if (action.equals("fill")) {
                    Machine.CoffeeMachineState.setCurrentState(Machine.CoffeeMachineState.FILL);
                    break;
                }


                if (action.equals("take")) {
                    this.take(this,option);
                    break;
                }
                if (action.equals("remaining")) {
                    this.getRemainingResources(this);
                    break;
                }
                if (action.equals("exit")) {
                    break;
                }
            }
            case BUY: {
                this.buy(this, action);
                break;
            }
            case FILL: {
                Machine.CoffeeMachineState.setCurrentState(Machine.CoffeeMachineState.FILLING_WATER);
                //state = CoffeeMachineState.FILLING_WATER;
                this.fill(this,Machine.CoffeeMachineState.getCurrentState(), action);
                break;
            }
            case FILLING_MILK: {
                this.fill(this,Machine.CoffeeMachineState.getCurrentState(), action);
                break;
            }
            case FILLING_COFFE_B: {
                this.fill(this,Machine.CoffeeMachineState.getCurrentState(), action);
                break;
            }
            case FILLING_CUPS: {
                this.fill(this,Machine.CoffeeMachineState.getCurrentState(), action);
            }

        }

    }


    private static int howMuchWeCanMake (Machine apr, CoffeeEspresso _1CoffeEspresso) {
        int cofeesBasedOnMilk = apr.getMilk() / _1CoffeEspresso.milk;
        int cofeesBasedOnWater = apr.getWater() / _1CoffeEspresso.water;
        int cofeesBasedOnCofeeBeans = apr.getCofeeBeans() / _1CoffeEspresso.cofeeBeans;
        Integer[] calculatedCaps = {cofeesBasedOnMilk,cofeesBasedOnWater,cofeesBasedOnCofeeBeans };

        return Collections.min(Arrays.asList(calculatedCaps));
    }

    private static int howMuchMoreCupsOfCoffeWillBePossible(Machine apr, CoffeeEspresso _1CoffeEspresso, int CupsOfC_AlreadyServed) {

        int leftMilkOnMachine = apr.getMilk() -  _1CoffeEspresso.milk * CupsOfC_AlreadyServed;
        int leftMWaterOMachine = apr.getWater() - _1CoffeEspresso.water * CupsOfC_AlreadyServed;
        int leftCofeeBeansOnMachine = apr.getCofeeBeans() - _1CoffeEspresso.cofeeBeans * CupsOfC_AlreadyServed;

        int cofeesBasedOnMilk = leftMilkOnMachine / _1CoffeEspresso.milk;
        int cofeesBasedOnWater = leftMWaterOMachine / _1CoffeEspresso.water;
        int cofeesBasedOnCofeeBeans = leftCofeeBeansOnMachine / _1CoffeEspresso.cofeeBeans;
        Integer[] calculatedCaps = {cofeesBasedOnMilk,cofeesBasedOnWater,cofeesBasedOnCofeeBeans };

        return Collections.min(Arrays.asList(calculatedCaps));
    }

    private boolean  canWeMake (Machine apr, Coffee coffee, int cups) {

        boolean canWeMakeV = false;
        int cofeesBasedOnMilk = apr.getMilk() - ( coffee.getMilk() * cups );
        if (cofeesBasedOnMilk < 0) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        int cofeesBasedOnWater = apr.getWater() - ( coffee.getWater() * cups );
        if (cofeesBasedOnWater < 0) {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        int cofeesBasedOnCofeeBeans = apr.getCofeeBeans() - ( coffee.getCofeeBeans() * cups );
        if (cofeesBasedOnCofeeBeans < 0) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        }
        int cupsV = apr.getDisposableCups() - cups;
        if (cupsV < 0) {
            System.out.println("Sorry, not enough disposable cups!");
            return false;
        }

        if (cofeesBasedOnMilk > 0 && cofeesBasedOnWater > 0 && cofeesBasedOnCofeeBeans > 0 && cupsV > 0) {
            canWeMakeV = true;
            System.out.println("I have enough resources, making you a coffee!");
        }
        return canWeMakeV;
    }

    private void getRemainingResources(Machine machine) {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(machine.getWater() + " of water");
        System.out.println(machine.getMilk() + " of milk");
        System.out.println(machine.getCofeeBeans() + " of coffee beans");
        System.out.println(machine.getDisposableCups() + " of disposable cups");
        System.out.println("$" + machine.getAmountOfMonney() + " of money");
        System.out.println();
        Machine.CoffeeMachineState.setCurrentState(Machine.CoffeeMachineState.INITIAL);

    }

    private void fill (Machine machine, Machine.CoffeeMachineState resource, String action) {

        switch (resource) {
            case FILLING_WATER: {
                System.out.println("Write how many ml of water do you want to add:");
                machine.setMachineWater( machine.getWater() + Integer.valueOf(action) );//sc.nextInt() ); //> 2000
                Machine.CoffeeMachineState.setCurrentState(Machine.CoffeeMachineState.FILLING_MILK);
                break;
            }
            case FILLING_MILK: {
                System.out.println("Write how many ml of milk do you want to add: :");
                machine.setMachineMilk( machine.getMilk() + Integer.valueOf(action)  ); //> 500
                Machine.CoffeeMachineState.setCurrentState(Machine.CoffeeMachineState.FILLING_COFFE_B);
                break;
            }
            case FILLING_COFFE_B: {
                System.out.println("Write how many grams of coffee beans do you want to add:");
                machine.setMachineCofeeBeans( machine.getCofeeBeans() + Integer.valueOf(action) ); //> 100
                Machine.CoffeeMachineState.setCurrentState(Machine.CoffeeMachineState.FILLING_CUPS);
                break;

            }
            case FILLING_CUPS: {
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                machine.setDisposableCups( machine.getDisposableCups() + Integer.valueOf(action) ); //> 500
                Machine.CoffeeMachineState.setCurrentState(Machine.CoffeeMachineState.INITIAL);
                break;
            }

        }




    }

    private void buy (Machine machine, String actionBuy) {

        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String option = actionBuy;
        switch (option) {
            case "1": {
                if  ( machine.canWeMake(machine, machine.coffEespresso, 1) ) {
                    machine.setMachineWater(machine.getWater() - machine.coffEespresso.water); //
                    machine.setMachineMilk(machine.getMilk() - machine.coffEespresso.milk); //
                    machine.setMachineCofeeBeans(machine.getCofeeBeans() - machine.coffEespresso.cofeeBeans); //
                    machine.setAmountOfMonney(machine.getAmountOfMonney() + machine.coffEespresso.cost); //> 500
                    machine.setDisposableCups( machine.getDisposableCups() -1  ); //> 500
                }
                break;
            }
            case "2": {
                if  ( machine.canWeMake(machine, machine.coffeLatte, 1) ) {
                    machine.setMachineWater(machine.getWater() - machine.coffeLatte.water); //
                    machine.setMachineMilk(machine.getMilk() - machine.coffeLatte.milk); //
                    machine.setMachineCofeeBeans(machine.getCofeeBeans() - machine.coffeLatte.cofeeBeans); //
                    machine.setAmountOfMonney(machine.getAmountOfMonney() + machine.coffeLatte.cost); //> 500
                    machine.setDisposableCups( machine.getDisposableCups() -1  ); //> 500
                }
                break;
            }
            case "3": {
                if  ( machine.canWeMake(machine, machine.coffeCappuccino, 1) ) {
                    machine.setMachineWater(machine.getWater() - machine.coffeCappuccino.water); //
                    machine.setMachineMilk(machine.getMilk() - machine.coffeCappuccino.milk); //
                    machine.setMachineCofeeBeans(machine.getCofeeBeans() - machine.coffeCappuccino.cofeeBeans); //
                    machine.setAmountOfMonney(machine.getAmountOfMonney() + machine.coffeCappuccino.cost); //> 500
                    machine.setDisposableCups( machine.getDisposableCups() -1  ); //> 500
                }
                break;
            }
            case "back": {
                break;
            }
        }

        CoffeeMachineState.setCurrentState(Machine.CoffeeMachineState.INITIAL);


    }

    private void take(Machine machine ,Machine.CoffeeMachineState state) {
        System.out.println("I gave you $" + machine.getAmountOfMonney());
        machine.setAmountOfMonney(0);
        Machine.CoffeeMachineState.setCurrentState(Machine.CoffeeMachineState.INITIAL);

    }

    private void utilhowMuchWeCanGet (Machine machine) {
        int howMAnnyCoupsofCoffeYouNeed = 0; //cups


        System.out.println("Write how many ml of water the coffee machine has:");
        Scanner scaner = new Scanner(System.in);
        if (scaner.hasNextInt()) {
            machine.setMachineWater(scaner.nextInt());
        }
        System.out.println("Write how many ml of milk the coffee machine has:");
        if (scaner.hasNextInt()) {
            machine.setMachineMilk(scaner.nextInt());
        }
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        if (scaner.hasNextInt()) {
            machine.setMachineCofeeBeans(scaner.nextInt());
        }
        System.out.println("Write how many cups of coffee you will need:");
        if (scaner.hasNextInt()) {
            howMAnnyCoupsofCoffeYouNeed =  scaner.nextInt();
        }


        int howMuchWeCanMake = Machine.howMuchWeCanMake(machine, Machine.coffEespresso);
        int howMuchMoreCupsOfCoffeWillBePossible = Machine.howMuchMoreCupsOfCoffeWillBePossible (machine, Machine.coffEespresso, howMAnnyCoupsofCoffeYouNeed);


        if ( howMAnnyCoupsofCoffeYouNeed > howMuchWeCanMake  ) {
            System.out.println("No, I can make only " + howMuchWeCanMake + " cup(s) of coffee");
        }
        else if ((howMAnnyCoupsofCoffeYouNeed < howMuchWeCanMake) && howMuchMoreCupsOfCoffeWillBePossible > 0 )
            System.out.println("Yes, I can make that amount of coffee (and even " +howMuchMoreCupsOfCoffeWillBePossible+ " more than that)");

        else if ( (howMAnnyCoupsofCoffeYouNeed <= howMuchWeCanMake) && howMuchMoreCupsOfCoffeWillBePossible == 0 ) {
            System.out.println("Yes, I can make that amount of coffee");
        }


    }


}

