public class Main {
    public static void main(String[] args) {
        suma(10,20,30);
        Coche miCoche = new Coche();
        miCoche.NPuertas();
        miCoche.NPuertas();
        System.out.println(miCoche.Puertas);

    }



    public static void suma(int a, int b, int c) {
        int Resultado;
        Resultado = a+b*c;
        System.out.println(Resultado);

    }
}


class Coche{
    public int Puertas = 0;

    public void NPuertas(){
        this.Puertas++;
    }
}
