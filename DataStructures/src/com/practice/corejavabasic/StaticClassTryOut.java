package corejavabasic;

public class StaticClassTryOut {

    private class Country {
        private String name;
        private boolean isAsian;

        public Country(String name) {
            this.name = name;
        }

        public boolean  isAsian(){
            return true;
        }

        public  void  setAsian(boolean isAsian){
            isAsian = isAsian;
        }
    }


    public static void main(String[] args) {
        StaticClassTryOut staticClass = new StaticClassTryOut();
        Country country = staticClass.new Country("India");
        country.setAsian(true);
        country.isAsian();
    }
}
