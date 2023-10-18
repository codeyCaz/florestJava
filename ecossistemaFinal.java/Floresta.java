public class Floresta {
    public static void main(String[] args) throws Exception {
        // terrno
        Terreno terreno = new Terreno(10);
        // largata
        Herbivoro largata = new Herbivero("Largata", false, 1,);
        // onça
        Carnivoro onca = new Carnivoro("Onça", true, 2);
        // girassol
        Girassol girassol = new Girassol("Arbusto", 3);

        terreno.adicionarAnimal(largata);
        terreno.adicionarAnimal(onca);
        while(true) {
            terreno.adicionarGirassol(girassol);
            terreno.exibirTerreno();
            largata.mover(terreno, largata);
            girassol.tempoVida++;
            onca.tempoVida++;
            largata.tempoVida++;
            if(onca.getposicaoC() == largata.getposicaoC() && onca.getposicaoA()) {
                onca.comer(onca, largata, terreno);
                if(largata.vida == 0) {
                    break;
                }

            }
            Thread.sleep(100);
        
        }
    }
    
}
