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
                System.out.println(peca);
            case "B< ":
            case " <B":
            case "b< ":
            case " <b":
                System.out.println(peca);
            case " D ":
            case " d ":
                System.out.println(peca);
            case " R ":
            case " r ":
                System.out.println(peca);
        }
        return 404;
    }

}
