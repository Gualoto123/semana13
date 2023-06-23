import java.util.Scanner;

 public abstract class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int opcion;

         do {
             System.out.println("Escoja una figura geométrica:");
             System.out.println("1. Triángulo");
             System.out.println("2. Cuadrado");
             System.out.println("3. Círculo");
             System.out.println("0. Salir");
             System.out.print("Opción: ");
             opcion = scanner.nextInt();

             if (opcion >= 1 && opcion <= 3) {
                 System.out.println("Escoja qué desea calcular:");
                 System.out.println("1. Área");
                 System.out.println("2. Perímetro");
                 System.out.print("Opción: ");
                 int opcionCalculo = scanner.nextInt();

                 Figura figura;

                 switch (opcion) {
                     case 1:
                         figura = new Triangulo();
                         leerPuntos(figura, scanner, 3);
                         break;
                     case 2:
                         figura = new Cuadrado();
                         leerPuntos(figura, scanner, 2);
                         break;
                     case 3:
                         System.out.print("Ingrese el radio del círculo: ");
                         double radio = scanner.nextDouble();
                         figura = new Circulo(radio);
                         break;
                     default:
                         continue;
                 }

                 double resultado;
                 if (opcionCalculo == 1) {
                     resultado = figura.calcularArea();
                     System.out.println("El área de la figura es: " + resultado);
                 } else if (opcionCalculo == 2) {
                     resultado = figura.calcularPerimetro();
                     System.out.println("El perímetro de la figura es: " + resultado);
                 }
             }
         } while (opcion != 0);
     }

     private static void leerPuntos(Figura figura, Scanner scanner, int cantidadPuntos) {
         for (int i = 1; i <= cantidadPuntos; i++) {
             System.out.print("Ingrese la coordenada x del punto " + i + ": ");
             double x = scanner.nextDouble();
             System.out.print("Ingrese la coordenada y del punto " + i + ": ");
             double y = scanner.nextDouble();
             Punto punto = new Punto(x, y);
             figura.agregarPunto(punto);
         }
     }
 }