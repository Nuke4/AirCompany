package airline;




import java.util.ArrayList;


/**
 * Creation Airport
 */
public class Airport {

    private Company company;
    private ArrayList<PassangerPlane> passangers;
    private ArrayList<FreighterPlane> freighters;
    private Director director;
    private Director director2;
    private Director director3;

public Airport(){
    passangers = new ArrayList<PassangerPlane>();
    freighters = new ArrayList<FreighterPlane>();
    company = Company.getCompanyInstance();
}
    public void create() {

        String type = "Passanger";
        String name = "boing 747 ";
        int flyRange = 10000;
        int fuelConsumption = 125;
        int flySpeed = 6000;
        int capacity = 235;


        String type2 = "Passanger";
        String name2 = "aerobus 380 ";
        int flyRange2 = 8600;
        int fuelConsumption2 = 165;
        int flySpeed2 = 5450;
        int capacity2 = 200;


        String type3 = "Freighter";
        String name3 = "Tu 154";
        int flyRange3 = 16000;
        int fuelConsumption3 = 188;
        int flySpeed3 = 6060;
        int tonnage3 = 800;

        director = new Director(type);
        passangers.add((PassangerPlane) director.getPlane(name,flyRange,fuelConsumption,flySpeed,capacity));
        director2 = new Director(type2);
        passangers.add((PassangerPlane) director2.getPlane(name2,flyRange2,fuelConsumption2,flySpeed2,capacity2));
        director3 = new Director(type3);
        freighters.add((FreighterPlane) director3.getPlane(name3, flyRange3, fuelConsumption3, flySpeed3, tonnage3));


        company.setFreighters(freighters);
        company.setPassangers(passangers);
    }





}