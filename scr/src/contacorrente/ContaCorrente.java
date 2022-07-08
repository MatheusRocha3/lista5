package contacorrente;

public class ContaCorrente {
    int numeroDaConta;
    String nomeDoCorrentista;
    double saldo = 0;

    public ContaCorrente(int numeroDaConta, String nomeDoCorrentista, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = saldo;
    }

    public ContaCorrente(int numeroDaConta, String nomeDoCorrentista) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
    }
}