package logic;


    import java.util.Comparator;


    class RangeComporator implements Comparator<RangeValue> {

        //@Override
        @Override
        public int compare(RangeValue o1, RangeValue o2) {
            int range1 = o1.getRange();
            int range2 = o2.getRange();

            if (range1<range2){
                return -1;
            } else if (range1==range2){
                return 0;
            } else {
                return 1;
            }
        }

    }


