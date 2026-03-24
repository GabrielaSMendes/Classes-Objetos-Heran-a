package exercico3;

public class Exercico3 {

}
class Gato {
    private String nome;
    private int idade;

    public Gato(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido");
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("A idade adicionada está inválida! A idade do gatinho deve ser >= 0");
        }
    }

    public static void main(String[] args) {
        Gato gato = new Gato("Milla", 5);

        gato.setIdade(-1);
        System.out.println("Idade do gatinho inválida: " + gato.getIdade());

        gato.setNome(" ");
        System.out.println("Nome do gatinho inválida: " + gato.getNome());

        System.out.println("\nDefinindo valores válidos...");
        gato.setNome("Mimi");
        gato.setIdade(3);
        System.out.println("Gatinhos atualizados: " + gato.getNome() + ", idade: " + gato.getIdade());
    }
}
