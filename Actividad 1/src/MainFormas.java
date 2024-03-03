import java.util.Scanner;

public class MainFormas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuál es el radio del círculo?: ");
        double radio = scanner.nextDouble();
        Circulo circulo = new Circulo (radio);

        System.out.println("Cuál es la base del rectángulo?: ");
        double base = scanner.nextDouble();
        System.out.println("Cuál es la altura del rectángulo?: ");
        double altura = scanner.nextDouble();
        Rectangulo rectangulo = new Rectangulo(base, altura);


        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }

}
