package exercico4;

public class Exercico4 {

}
class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor para depositar deve ser positivo.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado. Seu saldo atual é de: R$ " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Para realizar o saque deve ser um número positivo");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque de R$ " + valor + ". Seu saldo atual é de: R$ " + saldo);
            return;
        }
        saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);

        System.out.println("Saldo inicial: R$ " + conta.getSaldo());
        conta.depositar(150000.0);
        conta.sacar(20000.0);
        conta.sacar(40000.0);
        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
