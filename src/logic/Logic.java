package logic;



    import airline.FreighterPlane;
    import airline.PassangerPlane;
    import java.util.ArrayList;



    public class Logic {






        public ArrayList<String> findPlanesByFuel(ArrayList<PassangerPlane> passangers, ArrayList<FreighterPlane> freighters,
                                                  int lowValue, int highValue){

            ArrayList<String> total = new ArrayList<String>();

            for(PassangerPlane pass: passangers){

                if ((pass.getFuelConsumption()>=lowValue)&&(pass.getFuelConsumption()<=highValue)){
                    total.add("Название "+pass.getName()+" Расход топлива: "+pass.getFuelConsumption());
                }
            }

            for(FreighterPlane freigh: freighters){

                if ((freigh.getFuelConsumption()>=lowValue)&&(freigh.getFuelConsumption()<=highValue)){
                    total.add("Название "+freigh.getName()+" Расход топлива: "+freigh.getFuelConsumption());
                }
            }


            return total;

        }

        public int totalCapacity(ArrayList<PassangerPlane> Passangers)
        {

            int tCapacity = 0;
            for(PassangerPlane g : Passangers){

                tCapacity+=g.getCapacity();
            }

            return tCapacity;
        }

        public int totalTonnage(ArrayList<FreighterPlane> Freighters)
        {

            int tTonnage = 0;
            for(FreighterPlane f : Freighters){

                tTonnage+=f.getTonnage();
            }



            return tTonnage;



        }


        public ArrayList<RangeValue> RangeSort(ArrayList<PassangerPlane> passangers, ArrayList<FreighterPlane> freighters)
        {
            RangeComporator r = new RangeComporator();
            RangeValue rV;
            ArrayList<RangeValue> rVR = new ArrayList<RangeValue>();


            for(PassangerPlane p : passangers){

                rV = new RangeValue(p.getName(),p.getFlyRange());
                rVR.add(rV);

            }

            for(FreighterPlane f : freighters){

                rV = new RangeValue(f.getName(),f.getFlyRange());
                rVR.add(rV);

            }

            rVR.sort(r);




            return rVR;


        }


    }


