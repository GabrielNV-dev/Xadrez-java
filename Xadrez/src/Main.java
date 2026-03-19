import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, DestinoX, DestinoY;

        String[][] tabuleiro = new String[8][8];//Cria o tabuleiro com uma matriz

        String[] pretas = {" t ", " c ", "b< ", " d ", " r ", " >b", " c ", " t ", " p "};//Cria um vetor com as peças pretas
        String[] brancas = {" T ", " C ", "B< ", " D ", " R ", " >B", " C ", " T ", " P "};//Cria um vetor com as peças brancas

        List<String> pecas_pretas = Arrays.asList(pretas);//Cria uma lista com o vetor das peças pretas
        List<String> pecas_brancas = Arrays.asList(brancas);//Cria uma lista com o vetor das peças brancas


        for (int i = 0; i < tabuleiro.length; i++) {
            for (int t = 0; t < tabuleiro.length; t++) {// Uso de dois 'for' para imprimir o tabuleiro com base nas coordenadas

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

                System.out.print("(" + tabuleiro[i][t] + ") ");//Imprime o tabuleiro
            }
            System.out.println();

        }
        do {
            System.out.println("Linha que deseja mexer:");//Pergunta para o usuário onde está a peça e para onde ele deseja ir
            x = sc.nextInt();
            System.out.println("Coluna que deseja mexer:");
            y = sc.nextInt();
            System.out.println("Linha que deseja jogar:");
            DestinoX = sc.nextInt();
            System.out.println("Coluna que deseja jogar:");
            DestinoY = sc.nextInt();

        } while (x < 1 || x > 8 || y < 1 || y > 8 || DestinoX < 1 || DestinoX > 8 || DestinoY < 1 || DestinoY > 8 );

    }
}