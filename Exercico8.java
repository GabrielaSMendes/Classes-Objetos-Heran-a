package exercico8;

public class Exercico8 {

}
abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double calcularSalario();
}

class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

   
    public double calcularSalario() {
        return salario + bonus;
    }
}

class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    
    public double calcularSalario() {
        return salario + comissao;
    }

    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[] {
                new Gerente("Chaing", 180000.0, 2300.0),
                new Vendedor("Brian", 68000.0, 9500.0),
                new Vendedor("B", 9900.0, 5600.0)
        };

        for (Funcionario funcionario : funcionarios) {
            System.out.println(
                    "Funcionário: " + funcionario.getNome() +
                            " | Salário base: R$ " + funcionario.getSalario() +
                            " | Salário total: R$ " + funcionario.calcularSalario()
            );
        }
    }
}
