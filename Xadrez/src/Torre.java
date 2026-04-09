import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void vizualizar(String tabuleiro[][]) {
        System.out.println("    0     1     2     3     4     5     6     7 ");
        System.out.println("    |     |     |     |     |     |     |     |");
        for (int i = 0; i < tabuleiro.length; i++){
            System.out.print((i)+"-");
            for (int t = 0; t < tabuleiro.length; t++){
                System.out.print("(" + tabuleiro[i][t] + ") ");
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, c, DestinoL, DestinoC; 

        String[][] tabuleiro = new String[8][8];//Cria o tabuleiro com uma matriz

        String[] pretas = {" t ", " c ", "b< ", " d ", " r ", " >b", " c ", " t ", " p "};//Cria um vetor com as peças pretas
        String[] brancas = {" T ", " C ", "B< ", " D ", " R ", " >B", " C ", " T ", " P "};//Cria um vetor com as peças brancas

        List<String> pecas_pretas = Arrays.asList(pretas);//Cria uma lista com o vetor das peças pretas
        List<String> pecas_brancas = Arrays.asList(brancas);//Cria uma lista com o vetor das peças brancas

        // Uso de dois 'for' para imprimir o tabuleiro com base nas coordenadas
        System.out.println("    0     1     2     3     4     5     6     7 ");
        System.out.println("    |     |     |     |     |     |     |     | ");
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print((i)+"-");

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
                tabuleiro[0][0] = " T ";
                System.out.print("(" + tabuleiro[i][t] + ") ");//Imprime o tabuleiro
            }
            System.out.println();

        }

        while (true){
            //Pergunta para o usuário onde está a peça e para onde ele deseja ir
            do {
                System.out.println("Linha que deseja mexer:");
                l = sc.nextInt();
                System.out.println("Coluna que deseja mexer:");
                c = sc.nextInt();
                System.out.println("Linha que deseja jogar:");
                DestinoL = sc.nextInt();
                System.out.println("Coluna que deseja jogar:");
                DestinoC = sc.nextInt();

            } while (l < -123);

            System.out.println(gerenciador.adm(tabuleiro, tabuleiro[l][c], l, c, DestinoL, DestinoC));
            if (gerenciador.adm(tabuleiro, tabuleiro[l][c], l, c, DestinoL, DestinoC) == 1){
                tabuleiro[DestinoL][DestinoC] = tabuleiro[l][c];
                tabuleiro[l][c] = "   ";
            } else {
                System.out.println("Movimento invalido");
            }
            vizualizar(tabuleiro);

        }
    }
}
