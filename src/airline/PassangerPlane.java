package airline;

import java.util.ArrayList;

/**
 * Creation Passanger Plane
 */

    public class PassangerPlane extends Plane {

        int capacity;

        public PassangerPlane() {
        }

        public PassangerPlane(String name, int flyRange, int fuelConsumption,
                              int flySpeed) {
            this.name = name;
            this.flyRange = flyRange;
            this.fuelConsumption = fuelConsumption;
            this.flySpeed = flySpeed;
        }
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append(" Вместимость = " + this.capacity);
            return super.toString() + builder.toString();
        }

        public int getCapacity() {
            return capacity;
        }


    public void setCapacity(int capacity) {
            this.capacity = capacity;
        }



    }




