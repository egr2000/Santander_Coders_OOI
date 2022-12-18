public class Main {
    public static void main(String[] args) {

        Retangulo ret = new Retangulo(30, 40, "vermelho");
        System.out.println(ret.toString());
        System.out.println("Area do retangulo: " + ret.area());

        Quadrado quad = new Quadrado(40, "verde");
        System.out.println("\n" + quad.toString());
        System.out.println("Area do quadrado: " + quad.area());

        Circulo cir = new Circulo(10, "amarelo");
        System.out.println("\n" + cir.toString());
        System.out.println("Area do Circulo: " + cir.area());
        System.out.println("Diametro do Circulo: " + cir.getDiametro());

        Triangulo tri = new Triangulo(20, 30, "Rosa");
        System.out.println("\n" + tri.toString());
        System.out.println("Area do Triangulo: " + tri.area());

    }
}