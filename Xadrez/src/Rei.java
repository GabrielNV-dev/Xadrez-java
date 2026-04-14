import java.util.Arrays;
import java.util.List;

public class Rei {
    public static int validar(String[][] tabuleiro, String peca, int l, int c, int destinoL, int destinoC) {

        String[] pretas = {" t ", " c ", "b< ", " d ", " r ", " >b", " c ", " t ", " p "};//Cria um vetor com as peças pretas
        String[] brancas = {" T ", " C ", "B< ", " D ", " R ", " >B", " C ", " T ", " P "};//Cria um vetor com as peças brancas


        List<String> pecas_pretas = Arrays.asList(pretas);//Cria uma lista com o vetor das peças pretas
        List<String> pecas_brancas = Arrays.asList(brancas);//Cria uma lista com o vetor das peças brancas

        boolean v = ((l+1 == destinoL) && ((c+1 == destinoC) || (c-1 == destinoC) || (c == destinoC)) || (l-1 == destinoL) && ((c+1 == destinoC) || (c-1 == destinoC) || (c == destinoC)));

        if(pecas_brancas.contains(peca)) {

            if ((destinoL == l) && (destinoC == c)) {
                return 0;

            } else if (v) {

                if (pecas_brancas.contains(tabuleiro[destinoL][destinoC])) {
                    return 0;
                }
                System.out.println("sdfsdf");
                System.out.println(l + " " + destinoL + " " + c + " " + destinoC);
                return 1;
            } else {
                return 0;
            }
        } else{
            if ((destinoL == l) && (destinoC == c)) {
                return 0;
            } else if (v) {
                if (pecas_pretas.contains(tabuleiro[destinoL][destinoC])) {
                    return 0;
                }
                return 1;
            }
        }
        return 0;
    }
}
