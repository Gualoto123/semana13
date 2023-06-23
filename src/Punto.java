public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
public double calcularDistancia( Punto otroPunto){
        double dx= x - otroPunto.x;
        double dy= y - otroPunto.y;
        return Math.sqrt(dx*dx+ dy*dy);


}}
