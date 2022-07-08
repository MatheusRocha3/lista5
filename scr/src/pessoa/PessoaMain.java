package pessoa;

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("José", 16, 68, 1.78);
        pessoa1.envelhecer();
        pessoa1.engordar(2);
        pessoa1.emagrecer(1);
        pessoa1.pessoaApresentar();

        Pessoa pessoa2 = new Pessoa("José", 16, 1.78);
        pessoa2.envelhecer();
        pessoa2.engordar(2);
        pessoa2.emagrecer(1);
        pessoa2.pessoaApresentar();

    }
}