package carro;
public class CarroMain {

        public static void main(String[] args) {

            Carro carro1 = new Carro(4, "fox", "Toyota");
            System.out.println(carro1.marca);
            System.out.println(carro1.modelo);
            System.out.println(carro1.potencia);
            Carro carro2 = new Carro(2, "fiat", "Volkswagen");
            System.out.println("A potencia do corro 2 é " + carro2.potencia);

        }
    }

