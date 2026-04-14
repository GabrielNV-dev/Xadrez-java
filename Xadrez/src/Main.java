import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String reset = "\u001B[0m";
    public static final String preto =  "\u001B[38;5;16m";
    public static final String branco =  "\u001B[38;5;255m";
    public static final String FUNDO_BRANCO = "\u001B[1;32;47m";
    public static final String FUNDO_PRETO = "\u001B[48;5;22m";

    public static void vizualizar(String tabuleiro[][]) {
        System.out.println("   1  2  3  4  5  6  7  8 ");
        System.out.println("   |  |  |  |  |  |  |  |");


        for (int i = 0; i < tabuleiro.length; i++){
            System.out.print((i+1)+"-");

            for (int j = 0; j < tabuleiro.length; j++){

                String peca = tabuleiro[i][j];

                String fundo = ((i + j) % 2 == 0) ? FUNDO_BRANCO : FUNDO_PRETO;

                if (peca.trim().isEmpty()) {
                    System.out.print(fundo + "   " + reset );
                }
                else if (Character.isUpperCase(peca.trim().charAt(0))) {
                    System.out.print(fundo + branco + peca + reset );
                } else if (peca == " >B") {
                    System.out.print(fundo + branco + peca + reset );
                } else {
                    System.out.print(fundo + preto + peca + reset);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, c, DestinoL, DestinoC; int turno = 2;

        String[][] tabuleiro = new String[8][8];//Cria o tabuleiro com uma matriz

        String[] pretas = {" t ", " c ", "b< ", " d ", " r ", " >b", " c ", " t ", " p "};//Cria um vetor com as peças pretas
        String[] brancas = {" T ", " C ", "B< ", " D ", " R ", " >B", " C ", " T ", " P "};//Cria um vetor com as peças brancas

        List<String> pecas_pretas = Arrays.asList(pretas);//Cria uma lista com o vetor das peças pretas
        List<String> pecas_brancas = Arrays.asList(brancas);//Cria uma lista com o vetor das peças brancas

        for (int i = 0; i < tabuleiro.length; i++) {

            for (int t = 0; t < tabuleiro.length; t++) {

                if (i == 0){
                    tabuleiro[i][t] = pecas_pretas.get(t);//A primeira linha da matriz recebe os valores (da lista de peças pretas) das respectivas peças
                }
                else if (i == 1){
                    tabuleiro[i][t] = pecas_pretas.get(8);//A segunda linha da matriz recebe os valores (da lista de peças pretas) das respectivas peças
                }
                else if (i == 6) {
                    tabuleiro[i][t] = pecas_brancas.get(8);//A sétima linha da matriz recebe os valores (da lista de peças brancas) das respectivas peças
                }
                else if (i == 7){
                    tabuleiro[i][t] = pecas_brancas.get(t);//A oitava linha da matriz recebe os valores (da lista de peças brancas) das respectivas peças
                }
                else{
                    tabuleiro[i][t] = "   ";// O resto dos espaços recebem três espaços, sendo o "vazio" do tabuleiro na visualização
                }
            }
        }

        vizualizar(tabuleiro);
        System.out.println("Branco começa");
        while (true){
            //Pergunta para o usuário onde está a peça e para onde ele deseja ir
            do {
                System.out.println("Linha que deseja mexer:");
                l = sc.nextInt()-1;
                System.out.println("Coluna que deseja mexer:");
                c = sc.nextInt()-1;
                System.out.println("Linha que deseja jogar:");
                DestinoL = sc.nextInt()-1;
                System.out.println("Coluna que deseja jogar:");
                DestinoC = sc.nextInt()-1;

                try {
                    if(pecas_pretas.contains(tabuleiro[l][c]) && (turno % 2 == 0)){
                        System.out.println("Jogue com as suas peças!");
                        vizualizar(tabuleiro);
                        l = 1000;
                    } else if (pecas_brancas.contains(tabuleiro[l][c]) && (turno % 2 == 1)) {
                        System.out.println("Jogue com as suas peças!");
                        vizualizar(tabuleiro);
                        l = 1000;
                    }
                } catch (Exception e) {
                    System.out.println("Posição inválida!");
                    l = 1000;
                }

            } while (l < 0 || l > 7 || c < 0 || c > 7 || DestinoL < 0 || DestinoL > 7 || DestinoC < 0 || DestinoC > 7 );

            System.out.println(gerenciador.adm(tabuleiro, tabuleiro[l][c], l, c, DestinoL, DestinoC));
            if (gerenciador.adm(tabuleiro, tabuleiro[l][c], l, c, DestinoL, DestinoC) == 1){
                tabuleiro[DestinoL][DestinoC] = tabuleiro[l][c];
                tabuleiro[l][c] = "   ";
                turno++;
            } else {
                System.out.println("Movimento invalido");
            }
            vizualizar(tabuleiro);

        }
    }
}
