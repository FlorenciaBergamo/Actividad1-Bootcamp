public class Circulo implements calculosFormas{
    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea(){
        return PI * radio ^ 2;
    }

    public double calcularPerimetro(){
        return 2 * PI * radio;
    }
}
