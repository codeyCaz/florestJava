import java.util.Random;

public class Bichos {
    int tempoVida, posicaoC, posicaoA, vida;
    String nome, icone;
    boolean carnivoro;

    Random aleatorio = new Random();

    public Animal(String nome, boolean carnivoro, int vida, String icone) {
        this.nome = nome;
        this.carnivoro = carnivoro;
        this.tempoVida = 0;
        this.vida = vida;
        this.icone = icone;;
        this.posicaoA = aleatorio.nextInt(10);
        this.posicaoC = aleatorio.nextInt(10);
    }
    public void comer(Animal ataque, Animal fraco, Terreno terreno) {
        if(ataque.carnivoro == true && fraco.carnivoro == false) {
            fraco.vida--;
            if(fraco.vida == 0) {
                terreno.exibirTerreno();
                System.out.println(ataque.nome + "jantou" + fraco.nome);
                System.out.println(fraco.nome + "escapou " + fraco.tempoVida + "tempo vida");
                terreno.retirarAnimal(fraco);
            }
        }
    }

    public int getposicaoA() {
        return posicaoA;
    }
    public int getposicaoC() {
        return posicaoC;
    }

    public void mover(Terreno terreno, Animal animal) {
        int direcao = new Random().nextInt(6);
        int posC = getposicaoC();
        int posA = getposicaoA();
        switch(direcao) {
            case 1: posC++;
            break;
            case 2: posC--;
            break;
            case 3: posA++;
            break;
            case 4: posA--;
            break;
        }
        if (posC >= 0 && posC < terreno.getDimensao() && posA >= 0 && posA < terreno.getDimensao()) {
            terreno.retirarAnimal(animal);
            terreno.moverAnimal(animal, posC, posA);
            posicaoC = posC;
            posicaoA = posA;
        }
    }
    public void mostrar() {
        System.out.println("Nome: " +this.nome);
        System.out.println("Inicial: " +this.icone);
        System.out.println("Posição: " +posicaoC + " " +posicaoA);
    }

}
