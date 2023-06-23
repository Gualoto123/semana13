import java.util.ArrayList;
import java.util.Scanner;
abstract public class Figura {

        protected ArrayList<Punto> puntos;

        public Figura() {
            puntos = new ArrayList<>();
        }

        public abstract double calcularArea();

        public abstract double calcularPerimetro();

        public void agregarPunto(Punto punto) {
            puntos.add(punto);
        }
}
