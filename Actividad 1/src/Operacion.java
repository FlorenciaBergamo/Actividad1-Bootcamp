import java.util.Scanner;
public class Operacion {
    private int numero1;
    private int numero2;

    // Constructor con atributos
    public Operacion (int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Constructor sin atributos
    public Operacion () {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    // get y set
    public int getNumero1() {
        return numero1;
    }
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    // Crear Operacion
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        this.numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        this.numero2 = scanner.nextInt();
    }

    //Sumar
    public double sumar() {
        return this.numero1 + this.numero2;
    }

    //Restar
    public double restar() {
        return this.numero1 - this.numero2;
    }

    //multiplicar
    public double multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Por favor, ingresar números diferentes a 0");
            return 0;
        } else {
            return this.numero1 * this.numero2;
        }
    }

    //Dividir
    public double dividir() {
        if (this.numero2 == 0) {
            System.out.println("Por favor,  el segundo número debe ser diferente a 0");
            return 0;
        } else {
            return this.numero1 / this.numero2;
        }
    }

        public static void main(String[] args) {
            Operacion operacion = new Operacion();
            operacion.crearOperacion();

            System.out.println("la suma es: " + operacion.sumar());
            System.out.println("la resta es: " + operacion.restar());
            System.out.println("la multiplicación es: " + operacion.multiplicar());
            System.out.println("la división es " + operacion.dividir());

        }
}
