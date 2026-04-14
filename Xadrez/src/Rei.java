import java.util.Arrays;
import java.util.List;

public class Rei {
    public static int validar(String[][] tabuleiro, String peca, int l, int c, int destinoL, int destinoC, int[] roque) {
        //int[] roque = {0,0,0,0,0,0};
        //BT1 BT2 RT1 RT2 RB RP


        String[] pretas = {" t ", " c ", "b< ", " d ", " r ", " >b", " c ", " t ", " p "};//Cria um vetor com as peças pretas
        String[] brancas = {" T ", " C ", "B< ", " D ", " R ", " >B", " C ", " T ", " P "};//Cria um vetor com as peças brancas


        List<String> pecas_pretas = Arrays.asList(pretas);//Cria uma lista com o vetor das peças pretas
        List<String> pecas_brancas = Arrays.asList(brancas);//Cria uma lista com o vetor das peças brancas

        boolean v = ((l+1 == destinoL) && ((c+1 == destinoC) || (c-1 == destinoC) || (c == destinoC)) || (l-1 == destinoL) && ((c+1 == destinoC) || (c-1 == destinoC) || (c == destinoC)) || (l == destinoL) && ((c+1 == destinoC) || (c-1 == destinoC) || (c == destinoC)));

        if(pecas_brancas.contains(peca)) {

            if ((destinoL == l) && (destinoC == c)) {

                return 7;

            } else if ((destinoL == l) && (c+ 2 == destinoC) ||(c - 2 == destinoC)) {

                if (c + 2 == destinoC && tabuleiro[l][c+1] == "   " && tabuleiro[l][c+2] == "   " && roque[1] == 0 && (roque[4] == 0)){

                    return 2;
                }
                if (c - 2 == destinoC && tabuleiro[l][c-1] == "   " && tabuleiro[l][c-2] == "   " && tabuleiro[l][c-3] == "   " && roque[0] == 0 && roque[4] == 0){
                    return 2;
                }
            } else if (v) {

                if (pecas_brancas.contains(tabuleiro[destinoL][destinoC])) {

                    return 98;
                }
                return 1;

            } else {
                return 65;
            }
        } else{
            if ((destinoL == l) && (destinoC == c)) {
                return 987;
            } else if ((destinoL == l) && (c+ 2 == destinoC) ||(c - 2 == destinoC)) {
                if (c + 2 == destinoC && tabuleiro[l][c+1] == "   " && tabuleiro[l][c+2] == "   " && roque[3] == 0 && (roque[5] == 0)){
                    return 2;
                }
                if (c - 2 == destinoC && tabuleiro[l][c-1] == "   " && tabuleiro[l][c-2] == "   " && tabuleiro[l][c-3] == "   " && roque[2] == 0 && roque[5] == 0){
                    return 2;
                }

            } else if (v) {
                if (pecas_pretas.contains(tabuleiro[destinoL][destinoC])) {
                    return 231;
                }
                return 1;
            }
        }
        return 23;
    }
}
