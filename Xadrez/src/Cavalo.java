import java.util.Arrays;
import java.util.List;

public class Cavalo {
    public static int validar(String[][] tabuleiro, String peca, int l, int c, int destinoL, int destinoC){

        String[] pretas = {" t ", " c ", "b< ", " d ", " r ", " >b", " c ", " t ", " p "};//Cria um vetor com as peças pretas
        String[] brancas = {" T ", " C ", "B< ", " D ", " R ", " >B", " C ", " T ", " P "};//Cria um vetor com as peças brancas


        List<String> pecas_pretas = Arrays.asList(pretas);//Cria uma lista com o vetor das peças pretas
        List<String> pecas_brancas = Arrays.asList(brancas);//Cria uma lista com o vetor das peças brancas

        boolean v1 = l-2 == destinoL && (c + 1 == destinoC || c - 1 == destinoC);
        boolean v2 = l+2 == destinoL && (c + 1 == destinoC || c - 1 == destinoC);
        boolean v3 = c-2 == destinoC && (l + 1 == destinoL || l - 1 == destinoL);
        boolean v4 = c+2 == destinoC && (l + 1 == destinoL || l - 1 == destinoL);

        if (pecas_brancas.contains(peca)){

            if(!(v1 || v2 || v3 || v4) || pecas_brancas.contains(tabuleiro[destinoL][destinoC])){
                return 0;
            }

        } else{
            if(!(v1 || v2 || v3 || v4) || pecas_pretas.contains(tabuleiro[destinoL][destinoC])){
                return 0;
            }
        }
        return 1;
    }
}
