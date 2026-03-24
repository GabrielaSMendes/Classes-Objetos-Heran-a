package exercico2;

public class Exercico2 {

}
class Carro {
    private final String marca;
    private final String modelo;
    private int velocidadeAtual = 0;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar(int incremento) {
        velocidadeAtual += incremento;
        System.out.println("Carro " + marca + " " + modelo + " está a " + velocidadeAtual + " km/h");
    }


    public static void main(String[] args) {
        Carro[] carros = new Carro[] {
                new Carro("Toyota", "TR4"),
                new Carro("Honda", "S200"),
                new Carro("Ford", "Pampa")
        };

        for (Carro carro : carros) {
            carro.acelerar(50);
            carro.acelerar(100);
        }
    }
}
