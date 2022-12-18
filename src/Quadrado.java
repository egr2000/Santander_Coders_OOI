public class Quadrado extends Retangulo {

    public Quadrado(double lado1, String cor) {
        super(lado1, cor);
        this.lado1 = lado1;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado1=" + lado1 +
                ", cor='" + cor + '\'' +
                '}';
    }

    public double area() {
        return (lado1 * lado1);
    }
}
