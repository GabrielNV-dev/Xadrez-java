public class Torre {
    public static int validar(String[][] tabuleiro, String peca, int l, int c, int destinoL, int destinoC){

    if ((c != destinoC && l != destinoL) || (c == destinoC || l == destinoL)){
            return 0;
        }
    // Navegar pela matriz para achar os pontos limites.
    for (int navegador = 1; (l+navegador) <= destinoL; navegador++){
        if (tabuleiro[l + navegador][c] != "   "){
            if (destinoL >= navegador){
                return 0;
            }
        }
    }

    for (int navegador = 1; navegador < l; navegador++){
            if (tabuleiro[l - navegador][c] != "   "){
                if (destinoL <= (l-navegador)){
                    return 0;
                }
            }
    }

    for (int navegador = 1; navegador < c; navegador++){
            if (tabuleiro[l][c - navegador] != "   "){
                if (destinoC <= (c-navegador)){
                    return 0;
                }
            }
    }
    for (int navegador = 1; (c+navegador) <= destinoC; navegador++){
            if (tabuleiro[l][c+navegador] != "   "){
                if (destinoC >= navegador){
                    return 0;
                }
            }
        }
    return 1;
    }
}
