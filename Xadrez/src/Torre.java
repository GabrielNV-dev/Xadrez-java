import java.util.Arrays;
import java.util.List;

public class Torre {
    public static int validar(String[][] tabuleiro, String peca, int l, int c, int destinoL, int destinoC){

        String[] pretas = {" t ", " c ", "b< ", " d ", " r ", " >b", " c ", " t ", " p "};//Cria um vetor com as peças pretas
        String[] brancas = {" T ", " C ", "B< ", " D ", " R ", " >B", " C ", " T ", " P "};//Cria um vetor com as peças brancas

        List<String> pecas_pretas = Arrays.asList(pretas);//Cria uma lista com o vetor das peças pretas
        List<String> pecas_brancas = Arrays.asList(brancas);//Cria uma lista com o vetor das peças brancas


        if ((c != destinoC && l != destinoL) || (c == destinoC && l == destinoL)){
            System.out.println(c + " lol " + destinoC);
            return 0;
        }else{

            if(pecas_brancas.contains(peca)){

                if(pecas_pretas.contains(tabuleiro[destinoL][destinoC])){
                    // Navegar pela matriz para achar os pontos limites.
                    for (int navegador = 1; (l+navegador) <= destinoL; navegador++){
                        if (tabuleiro[l + navegador][c] != "   "){
                            if (destinoL > (l+navegador)){
                                return 15;
                            }
                        }
                    }

                    for (int navegador = 1; (c+navegador) <= destinoC; navegador++){
                        if (tabuleiro[l][c+navegador] != "   "){
                            if (destinoC > (c+navegador)){
                                System.out.println(destinoC +" e "+ (c+navegador));
                                return 25;
                            }
                        }
                    }

                    for (int navegador = 1; navegador < l; navegador++){
                        if (tabuleiro[l - navegador][c] != "   "){
                            if (destinoL < (l-navegador)){
                                return 35;
                            }
                        }
                    }

                    for (int navegador = 1; navegador < c; navegador++){
                        if (tabuleiro[l][c - navegador] != "   "){
                            if (destinoC < (c-navegador)){
                                return 45;
                            }
                        }
                    }
                }else{
                    // Navegar pela matriz para achar os pontos limites.
                    for (int navegador = 1; (l+navegador) <= destinoL; navegador++){
                        if (tabuleiro[l + navegador][c] != "   "){
                            if (destinoL >= (l+navegador)){
                                return 0;
                            }
                        }
                    }

                    for (int navegador = 1; (c+navegador) <= destinoC; navegador++){
                        if (tabuleiro[l][c+navegador] != "   "){
                            if (destinoC >= (c+navegador)){
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
                }

            }else{

                if(pecas_brancas.contains(tabuleiro[destinoL][destinoC])){
                    for (int navegador = 1; (l+navegador) <= destinoL; navegador++){
                        if (tabuleiro[l + navegador][c] != "   "){
                            if (destinoL > (l+navegador)){
                                return 10;
                            }
                        }
                    }

                    for (int navegador = 1; (c+navegador) <= destinoC; navegador++){
                        if (tabuleiro[l][c+navegador] != "   "){
                            if (destinoC > (c+navegador)){
                                return 20;
                            }
                        }
                    }

                    for (int navegador = 1; navegador < l; navegador++){
                        if (tabuleiro[l - navegador][c] != "   "){
                            if (destinoL < (l-navegador)){
                                return 30;
                            }
                        }
                    }

                    for (int navegador = 1; navegador < c; navegador++){
                        if (tabuleiro[l][c - navegador] != "   "){
                            if (destinoC < (c-navegador)){
                                return 40;
                            }
                        }
                    }
                }else{
                    // Navegar pela matriz para achar os pontos limites.
                    for (int navegador = 1; (l+navegador) <= destinoL; navegador++){
                        if (tabuleiro[l + navegador][c] != "   "){
                            if (destinoL >= navegador){
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
                }
            }

        return 1;
    }
}}
