package lista5bcaixaeletronico;
import java.util.Scanner;
public class CaixaEletronico {
    double saldo = 1000;
    double credito;
    double debito;
    Scanner input = new Scanner(System.in);
    public CaixaEletronico() {
        this.saldo = saldo;
        this.credito = credito;
        this.debito = debito;
    }

    public void credito() {
        System.out.println("Quanto você deseja inserir no caixa? : ");
        this.credito = input.nextDouble();
        double novoCredito = this.saldo + this.credito;
        saldo = novoCredito;
        System.out.println("Seu saldo atual é R$: " + this.saldo);
    }

    public void debito() {
        System.out.println("Quanto você deseja retirar do caixa : ");
        debito = input.nextDouble();
        double novoSaldo = this.saldo - this.debito;
        this.saldo = novoSaldo;
        System.out.println("Seu saldo atual é R$: " + this.saldo);
    }
}







