public class gerenciador {
    public static int adm(String[][] tabuleiro, String peca, int l, int c, int destinoL, int destinoC) {

        switch (peca){
            case " P ":
            case " p ":
                return peao.validar(tabuleiro, peca, l,  c, destinoL, destinoC);
            case " T ":
            case " t ":
                return Torre.validar(tabuleiro, peca, l,  c, destinoL, destinoC);
            case " C ":
            case " c ":
                return Cavalo.validar(tabuleiro, peca, l,  c, destinoL, destinoC);
            case "B< ":
            case " >B":
            case "b< ":
            case " >b":
                 return Bispo.validar(tabuleiro, peca, l,  c, destinoL, destinoC);
            case " D ":
            case " d ":
                 return Dama.validar(tabuleiro, peca, l,  c, destinoL, destinoC);
            case " R ":
            case " r ":
                 return Rei.validar(tabuleiro, peca, l,  c, destinoL, destinoC);
        }
        return 404;
    }

}
