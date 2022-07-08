package bola;

public class BolaMain {
    public static void main(String[] args) {
        Bola bola1 = new Bola(16, "azul", "boliche", 148);
        System.out.println("A circunferência da sua primeira bola é: " + bola1.circunferencia);
        System.out.println("A cor da sua bola é: " + bola1.cor);
        System.out.println("A marca da sua bola é: " + bola1.marca);
        System.out.println("A velocidade máxima da sua bola é: " + bola1.velocidade);


        Bola bola2 = new Bola(20, "amarela", "capacete", 100);
        System.out.println("A circunferência da sua segunda bola é: " + bola2.circunferencia);
        System.out.println("A cor da sua segunda bola é: " + bola2.cor);
        System.out.println("A marca da sua segunda bola é: " + bola2.marca);
        System.out.println("A velocidade máxima da sua segunda bola é: " + bola2.velocidade);

        Bola bola3 = new Bola(20, "amarela", "capacete", 100);
        System.out.println("A circunferência da sua terceira bola é: " + bola3.circunferencia);
        System.out.println("A cor da sua terceira bola é: " + bola3.cor);
        System.out.println("A marca da sua terceira bola é: " + bola3.marca);
        System.out.println("A velocidade máxima da sua terceira bola é: " + bola3.velocidade);
    }
}