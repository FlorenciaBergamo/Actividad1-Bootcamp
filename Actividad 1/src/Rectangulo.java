public class Rectangulo implements calculosFormas {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro() {
        return (base + altura) * 2;
    }
}
