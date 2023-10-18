public class Terreno {
    private String[][] area;
    private int dimensao;

    public Terreno(int dimensao) {
        this.dimensao = dimensao;
        area - new String [dimensao][dimensao];
        iniciarTerreno();;
    }
    public int getDimensao() {
        return dimensao;
    }

    //terreno
    private void iniciarTerreno() {
        for (int i = 0; 1 <dimensao; i++) {
            for (int l = 0; l <dimensao; l++)
            area[i][l] = "____";
        }
    }
    // mostrar o terreno
    public void exibirTerreno() {
        for(int i=0; i <dimensao; i++) {
            System.out.print("/");
            for (int l=0; l <dimensao; l++)
            System.out.print(area[i][l] + "___");
            System.out.println("/");
            
        }
        System.out.println("");
    }
    public void adicionarAnimal(Animal animal) {
        area[animal.getposicaoC()][animal.getposicaoA()] = animal.icone;
    }
    public void moverAnimal(Animal animal, int posC, int posA) {
        area[posC][posA] = animal.icone;
    }
    public void adicionarGirassol(Girassol girassol) {
        area[girassol.posicaoC][girassol.posicaoA] = girassol.icone;
    }
    public void retirarAnimal(Animal animal) {
        area[animal.getposicaoC()][animal.getposicaoA()] ="___";
    }


}
