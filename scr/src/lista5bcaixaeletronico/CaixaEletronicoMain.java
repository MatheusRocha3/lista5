package lista5bcaixaeletronico;
import java.util.Scanner;
public class CaixaEletronicoMain {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  CaixaEletronico caixaEletronico = new CaixaEletronico();
  boolean loop = true;
  while (loop) {
   System.out.println("             =========================");
   System.out.println("            |     1 - Adicionar dinheiro      |");
   System.out.println("            |     2 - Retirar dinheiro    |");
   System.out.println("                ==========================");
   System.out.println("Digite a opção desejada");
   int opcao = input.nextInt();
   if (opcao == 1) {
    caixaEletronico.credito();
   } else if (opcao == 2) {
    caixaEletronico.debito();
    System.out.println("Deseja continuar? S/N");
    String novaOperação = input.next();
    if (novaOperação.equalsIgnoreCase("N")) {
     System.out.println("operação encerrada. ");
     loop = false;
    }
    System.out.println("Seu saldo atual é de: " + caixaEletronico.saldo);
   }
  }
 }
}
