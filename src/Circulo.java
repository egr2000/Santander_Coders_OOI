public class Circulo extends Figura {

    public double raio;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", cor='" + cor + '\'' +
                '}';
    }

    public double getDiametro() {
        return (2 * this.raio);
    }

    public double area() {
        return (3.14 * this.raio * this.raio);
    }


}
