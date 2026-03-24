package exercico6;

public class Exercico6 {

}
class Veiculo {
    protected String marca;
    protected int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    
    public String toString() {
        return "Veiculo{marca='" + marca + "', ano=" + ano + "}";
    }
}

class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    
    public String toString() {
        return "Carro{marca='" + marca + "', ano=" + ano + ", portas=" + portas + "}";
    }
}

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, int ano, int cilindradas) {
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    
    public String toString() {
        return "Moto{marca='" + marca + "', ano=" + ano + ", cilindradas=" + cilindradas + "}";
    }

    public static void main(String[] args) {
        Carro carro = new Carro("byd", 2020, 4);
        Moto moto = new Moto("BMW", 2018, 250);

        System.out.println(carro);
        System.out.println(moto);
    }
}
