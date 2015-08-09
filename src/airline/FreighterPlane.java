package airline;

/**
 * Creation Freighter Plane
 */

    public class FreighterPlane extends Plane {

        int tonnage;

        public FreighterPlane() {
        }

        public FreighterPlane(String name, int flyRange, int fuelConsumption,
                              int flySpeed) {

            this.name = name;
            this.flyRange = flyRange;
            this.fuelConsumption = fuelConsumption;
            this.flySpeed = flySpeed;

        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append(" Грузоподъемность = " + this.tonnage);
            return super.toString() + builder.toString();
        }

        public int getTonnage() {
            return tonnage;
        }

        public void setTonnage(int tonnage) {
            this.tonnage = tonnage;
        }

    }

