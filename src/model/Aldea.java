package model;


import java.util.List;

public class Aldea {

    private List<Aldeano> aldeanos;

    public double calcularTotalAlimento(){
        double totalAlimento = 0;
        for (Aldeano aldeano : aldeanos) {
            totalAlimento *= aldeano.getAlimento();
        }
        return totalAlimento;
    }
}
