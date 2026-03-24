package exercicio1;

public class Exercicio1 {

}
class Gato {
    private final String nome;
    private final int idade;

    public Gato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void miar() {
        System.out.println("Miau!");
    }


 
    public static void main(String[] args) {
        Gato gato1 = new Gato("Banguela", 2);
        Gato gato2 = new Gato("Luz", 3);

        System.out.println("Gato 1: " + gato1.getNome() + ", idade: " + gato1.getIdade());
        gato1.miar();
        System.out.println("Gato 2: " + gato2.getNome() + ", idade: " + gato2.getIdade());
        gato2.miar();
    }
}
