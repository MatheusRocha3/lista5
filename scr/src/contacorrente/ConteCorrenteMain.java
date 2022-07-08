package contacorrente;

public class ConteCorrenteMain {
    public static void main(String [] args) {
        ContaCorrente contacorrente1 = new ContaCorrente(7756, "Luiz Fernando", 600);
        System.out.println("O número de sua conta é: " + contacorrente1.numeroDaConta);
        System.out.println("O nome do correntista é: " + contacorrente1.nomeDoCorrentista);
        System.out.println("O saldo da conta corrente é: " + contacorrente1.saldo);

        ContaCorrente contacorrente2 = new ContaCorrente(77509, "Maria Luiza");
        System.out.println("O número de sua conta é: " + contacorrente2.numeroDaConta);
        System.out.println("O nome do correntista é: " + contacorrente2.nomeDoCorrentista);
        System.out.println("O saldo da conta corrente é: " + contacorrente2.saldo);
    }
}
