import java.util.Arrays;
import java.util.List;

public class Bispo {
    public static int validar(String[][] tabuleiro, String peca, int l, int c, int destinoL, int destinoC) {

        String[] pretas = {" t ", " c ", "b< ", " d ", " r ", " >b", " c ", " t ", " p "};//Cria um vetor com as peças pretas
        String[] brancas = {" T ", " C ", "B< ", " D ", " R ", " >B", " C ", " T ", " P "};//Cria um vetor com as peças brancas

        List<String> pecas_pretas = Arrays.asList(pretas);//Cria uma lista com o vetor das peças pretas
        List<String> pecas_brancas = Arrays.asList(brancas);//Cria uma lista com o vetor das peças brancas

        int limit = 8;

        if (pecas_brancas.contains(peca)) {

            if (destinoL > l) {

                if (destinoC > c) {

                    if ((destinoL - l) != (destinoC - c)) {
                        return 0;
                    }

                    for (int i = 1; (i + l) <= destinoL; i++) {
                        if (!tabuleiro[l + i][c + i].equals("   ")) {
                            limit = i;
                            break;
                        }
                    }

                    if (pecas_pretas.contains(tabuleiro[destinoL][destinoC])){
                        limit += 1;
                    }

                    if ((destinoL - l) < (limit)) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else if (destinoC < c) {

                    if ((destinoL - l) != (c - destinoC)) {
                        return 0;
                    }

                    for (int j = 1; (j + l) <= destinoL; j++) {
                        if ((c - j) >= 0) {
                            if (!tabuleiro[l + j][c - j].equals("   ")) {
                                limit = j;
                                break;
                            }
                        }
                    }

                    if (pecas_pretas.contains(tabuleiro[destinoL][destinoC])){
                        limit += 1;
                    }

                    if ((destinoL - l) < limit) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            } else if (destinoL < l) {

                if (destinoC > c) {

                    if ((l - destinoL) != (destinoC - c)) {
                        return 0;
                    }

                    for (int x = 1; (x + destinoL) <= l; x++) {
                        if ((l - x) >= 0) {
                            if (!tabuleiro[l - x][c + x].equals("   ")) {
                                limit = x;
                                break;
                            }
                        }
                    }

                    if (pecas_pretas.contains(tabuleiro[destinoL][destinoC])){
                        limit += 1;
                    }

                    if ((l - destinoL) < (limit)) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else if (destinoC < c) {

                    if ((l - destinoL) != (c - destinoC)) {
                        return 0;
                    }

                    for (int y = 1; (y + destinoL) <= l; y++) {
                        if ((l - y) >= 0 && (c - y) >= 0) {
                            if (!tabuleiro[l - y][c - y].equals("   ")) {
                                limit = y;
                                break;
                            }
                        }
                    }

                    if (pecas_pretas.contains(tabuleiro[destinoL][destinoC])){
                        limit += 1;
                    }

                    if ((l - destinoL) < (limit)) {
                        return 1;
                    } else {
                        return 0;
                    }
                }

            }
        }else {

            if(pecas_pretas.contains(peca)) {

                if (destinoL > l) {

                    if (destinoC > c) {

                        if ((destinoL - l) != (destinoC - c)) {
                            return 0;
                        }

                        for (int i = 1; (i + l) <= destinoL; i++) {
                            if (!tabuleiro[l + i][c + i].equals("   ")) {
                                limit = i;
                                break;
                            }
                        }

                        if (pecas_brancas.contains(tabuleiro[destinoL][destinoC])){
                            limit += 1;
                        }

                        if ((destinoL - l) < (limit)) {
                            return 1;
                        } else {
                            return 0;
                        }
                    } else if (destinoC < c) {

                        if ((destinoL - l) != (c - destinoC)) {
                            return 0;
                        }

                        for (int j = 1; (j + l) <= destinoL; j++) {
                            if ((c - j) >= 0) {
                                if (!tabuleiro[l + j][c - j].equals("   ")) {
                                    limit = j;
                                    break;
                                }
                            }
                        }

                        if (pecas_brancas.contains(tabuleiro[destinoL][destinoC])){
                            limit += 1;
                        }

                        if ((destinoL - l) < limit) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                } else if (destinoL < l) {

                    if (destinoC > c) {

                        if ((l - destinoL) != (destinoC - c)) {
                            return 0;
                        }

                        for (int x = 1; (x + destinoL) <= l; x++) {
                            if ((l - x) >= 0) {
                                if (!tabuleiro[l - x][c + x].equals("   ")) {
                                    limit = x;
                                    break;
                                }
                            }
                        }

                        if (pecas_brancas.contains(tabuleiro[destinoL][destinoC])){
                            limit += 1;
                        }

                        if ((l - destinoL) < (limit)) {
                            return 1;
                        } else {
                            return 0;
                        }
                    } else if (destinoC < c) {

                        if ((l - destinoL) != (c - destinoC)) {
                            return 0;
                        }

                        for (int y = 1; (y + destinoL) <= l; y++) {
                            if ((l - y) >= 0 && (c - y) >= 0) {
                                if (!tabuleiro[l - y][c - y].equals("   ")) {
                                    limit = y;
                                    break;
                                }
                            }
                        }

                        if (pecas_brancas.contains(tabuleiro[destinoL][destinoC])){
                            limit += 1;
                        }

                        if ((l - destinoL) < (limit)) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }

                }
            }
        }
        return 0;
    }
}