public class Dama {
    public static int validar(String[][] tabuleiro, String peca, int l, int c, int destinoL, int destinoC) {
        if (l == destinoL || c == destinoC){
            return Torre.validar(tabuleiro, peca, l, c, destinoL, destinoC);
        } else{
            return Bispo.validar(tabuleiro, peca, l,  c, destinoL, destinoC);
        }
    }
}
