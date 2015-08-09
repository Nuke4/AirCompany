package airline;


import java.util.ArrayList;

public class Company {

    public ArrayList<PassangerPlane> passangers;
    public ArrayList<FreighterPlane> freighters;
    public static Company instance;

    public static Company getCompanyInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;

    }


    public ArrayList<PassangerPlane> getPassangers() {
        return passangers;
    }

    public void setPassangers(ArrayList<PassangerPlane> passangers) {
        this.passangers = passangers;
    }

    public ArrayList<FreighterPlane> getFreighters() {
        return freighters;
    }

    public void setFreighters(ArrayList<FreighterPlane> freighters) {
        this.freighters = freighters;
    }
}