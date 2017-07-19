package model;


public class Cazador extends Aldeano {

    @Override
    public double getAlimento() {
        if (dias % 3 == 0) {
            return (dias / 3) * 10;
        } else {
            return 0;
        }
    }
}
