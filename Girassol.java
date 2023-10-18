import java.util.Random;

public class Girassol {
    int tempoVida, vida, posicaoC, posicaoA;
    String nome, icone;
    Randomm aleatorio = new Random();

    public Girassol(String nome, int vida, String icone) {
        this.nome - nome;
        this.tempoVida = 0;
        this.vida = vida;
        this.icone = icone;
        this.posicaoC = aleatorio.nextInt(10);
        this.posicaoA = aleatorio.nextInt(10);

    }
    void mostrar() {
        System.out.println(this.nome);
    }

    
}
