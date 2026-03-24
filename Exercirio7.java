package exercico7;

public class Exercirio7 {

}
abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    
    public void emitirSom() {
        System.out.println(nome + ": Au au!");
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    
    public void emitirSom() {
        System.out.println(nome + ": Miau!");
    }
}

class Passaro extends Animal {
    public Passaro(String nome) {
        super(nome);
    }

    
    public void emitirSom() {
        System.out.println(nome + ": Piu piu!");
    }

    public static void main(String[] args) {
        Animal[] animais = new Animal[] {
                new Cachorro("BOB"),
                new Gato("Banguela"),
                new Passaro("Macerro"),
                new Cachorro("Amendoim")
        };

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
