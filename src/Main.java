public class Main {
    public static void main(String[] args) {
        suma(10, 20, 30);

        Coche miCoche = new Coche();
        System.out.println(miCoche.puertas);
    }

    private static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}


    class Coche {
    public int puertas = 2;
    public void sumapuertas() {this.puertas++;}
    }
