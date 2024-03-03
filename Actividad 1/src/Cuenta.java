import javax.crypto.spec.PSource;
import java.util.Scanner;
public class Cuenta {
    private int numeroCuenta;
    private long DNI;
    private double saldo;

    public Cuenta (){
    }

    public Cuenta (int numeroCuenta, long DNI, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    //get y set
    public int getnumeroCuenta(){
        return numeroCuenta;
    }
    public void setnumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI(){
        return DNI;
    }
    public void setDNI (long DNI){
        this.DNI = DNI;
    }

    public double getsaldo (){
        return saldo;
    }
    public void setsaldo (double saldo){
        this.saldo = saldo;
    }

    //Método crear objeto cuenta
    public static Cuenta crearCuenta() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresar número de cuenta: ");
        int numeroCuenta = scanner.nextInt();

        System.out.println("Ingresar DNI: ");
        long DNI = scanner.nextLong();

        System.out.println("Ingresar saldo inicial: ");
        double saldo = scanner.nextDouble();

        return new Cuenta (numeroCuenta, DNI, saldo);
    }

    //Método ingresar(double ingreso): el método recibe una cantidad de dinero a
    //ingresar y se la sumará al saldo actual.
    public void ingresar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuánto querés ingresar?:");
        double ingreso = scanner.nextDouble();

        saldo += ingreso;
        System.out.println("Saldo actual con el valor ingresado:" + saldo);
    }

    //Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
    //se le restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    //pondrá el saldo actual en 0.
    public void retirar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuánto querés retirar?:");
        double retiro = scanner.nextDouble();

        if (retiro > saldo) {
            saldo = 0;
        } else {
            saldo -= retiro;
        }
        System.out.println("Saldo actual después de retirar: $"+ saldo);
    }

    //Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo.
    public void extraccionRapida() {
        double limite = saldo * 0.20;
        System.out.println("Extracción rápida: $"+ limite);
    }

    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo() {
        System.out.println("Saldo: $" + saldo);
    }

    //Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
    public void consultarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI: " + DNI);
        System.out.println("Saldo: " + saldo);
    }

    public static void main (String[] args) {
        Cuenta cuenta = Cuenta.crearCuenta();
        cuenta.consultarDatos();
        cuenta.ingresar();
        cuenta.retirar();
        cuenta.extraccionRapida();
    }

}
