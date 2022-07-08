package lista5bJardinagem;

public class Jardinagem {
    String nomeJardim;
   double quantidadeDeMetros = 2;

    int quantidadeDePlantas;

    int quantidadeDeMetrosGrama;

   double kilosAdubo;
   double valorAdubo;
  double valorMetroGrama;
   double valorVendaGrama;
    public Jardinagem(String nomeJardim, int quantidadeDeMetrosGrama, double valorAdubo, double valorMetroGrama) {
        this.nomeJardim = nomeJardim;
        this.quantidadeDeMetrosGrama = quantidadeDeMetrosGrama;
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
    }
    public void JardimApresentar(){
        System.out.println("O nome do Jardim é: " + this.nomeJardim);
        System.out.println("O tamanho do jardim em metros é: " + quantidadeDeMetros);
        System.out.println("A quantidade de metros em grama é: " + quantidadeDeMetrosGrama);
    }
}

