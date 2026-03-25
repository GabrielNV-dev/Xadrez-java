public class Torre {
    public static int validar(String[][] tabuleiro, String peca, int l, int c, int destinoL, int destinoC){

    int limiteLmenos, limiteLmais, limiteCmenos, limiteCmais;

    // Navegar pela matriz para achar os pontos limites.
    for (int navegador = 1; (l+navegador) <= destinoL; navegador++){
        if (tabuleiro[l + navegador][c] != "   "){
            System.out.println(destinoL + " a " + navegador);
            if (destinoL > navegador){
                return 0;
            }
        }
    }

        for (int navegador = 1; navegador < l; navegador++){
            if (tabuleiro[l - navegador][c] != "   "){
                System.out.println(destinoL + " a " + navegador);
                if (destinoL < (l-navegador)){
                    return 0;
                }
            }
        }

    return 1;
    }
}
