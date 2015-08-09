package main;


import airline.Airport;
import airline.Company;
import airline.FreighterPlane;
import airline.PassangerPlane;
import logic.Logic;
import logic.RangeValue;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Company company = Company.getCompanyInstance();
        Airport imp = new Airport();
        imp.create();
        ArrayList<PassangerPlane> passangers = company.getPassangers();
        ArrayList<FreighterPlane> freighters = company.getFreighters();
        ArrayList<String> fuel;
        ArrayList<RangeValue> rV;
        Logic l = new Logic();
        fuel = l.findPlanesByFuel(passangers, freighters, 125, 150);

        for(PassangerPlane p : passangers){
            System.out.println(p.toString());
        }
        for(FreighterPlane f : freighters){
            System.out.println(f.toString());
        }


        System.out.println(" Общая грузоподъемность = " +l.totalTonnage(freighters));
        System.out.println(" Общая вместимость = " +l.totalCapacity(passangers));


        System.out.println("Поиск по расходу топлива :");


        for(String s : fuel){
            System.out.println(" "+ s);
        }



        System.out.println("Сортировка по диапазону полета:");
        rV = l.RangeSort(passangers, freighters);
        for(RangeValue j : rV ){
            System.out.println(" "+j.getName() + " " + j.getRange());
        }

    }
}




