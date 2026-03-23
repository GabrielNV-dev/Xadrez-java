import java.util.Arrays;
import java.util.List;

public class peao {
    public static int validar(String[][] tabuleiro, String peca, int l, int c, int destinoL, int destinoC) {
        int passe = 1, validador = 0;
        String[] pretas = {" t ", " c ", "b< ", " d ", " r ", " >b", " c ", " t ", " p "};//Cria um vetor com as peças pretas
        String[] brancas = {" T ", " C ", "B< ", " D ", " R ", " >B", " C ", " T ", " P "};//Cria um vetor com as peças brancas

        List<String> pecas_pretas = Arrays.asList(pretas);//Cria uma lista com o vetor das peças pretas
        List<String> pecas_brancas = Arrays.asList(brancas);//Cria uma lista com o vetor das peças brancas

        if (peca == " P ") {
            if (c != destinoC) {

                if (destinoL == (l - 1) && pecas_pretas.contains(tabuleiro[destinoL][destinoC]) && (destinoC == (c + 1) || destinoC == (c - 1))) {
                    validador = 1;
                }
            } else {
                if (l == 6) {
                    passe = 2;
                }
                ;
                if (l - destinoL <= passe && tabuleiro[l - 1][c] == "   " && tabuleiro[destinoL][c] == "   " && l > destinoL) {
                    validador = 1;
                }
            }
        }else {
            if (c != destinoC) {

                if (destinoL == (l + 1) && pecas_brancas.contains(tabuleiro[destinoL][destinoC]) && (destinoC == (c + 1) || destinoC == (c - 1))) {
                    validador = 1;
                }
            } else {
                if (l == 1) {
                    passe = 2;
                }

                if (destinoL - l <= passe && tabuleiro[l + 1][c] == "   " && tabuleiro[destinoL][c] == "   " && l < destinoL) {
                    validador = 1;
                }
            }
        }
        return validador;
    }
}
