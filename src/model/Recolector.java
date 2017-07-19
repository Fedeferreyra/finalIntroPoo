package model;

public class Recolector extends Aldeano {

    @Override
    public double getAlimento() {
        double value = 1 - dias * 0.1;
        if (value >= 0) {
            return value;
        } else {
            return 0;
        }
    }
}
