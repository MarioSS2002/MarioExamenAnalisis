package cr.go.ucr;

public class Rango {
    private double menor;
    private double mayor;
    private double valor;

    public Rango(double menor, double mayor, double valor) {
        this.menor = menor;
        this.mayor = mayor;
        this.valor = valor;
    }

    public double getMenor() {
        return menor;
    }

    public double getMayor() {
        return mayor;
    }

    public double getValor() {
        return valor;
    }
}
