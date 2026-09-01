package com.example.cartoladoigor;
public class CalculadoraPontuacao {

    public static double calcular(
            int assistencias,
            int desarmes,
            int gols,
            int naTrave,
            int defendidos,
            int faltasSofridas,
            int golContra,
            int cartaoAmarelo,
            int cartaoVermelho,
            int faltasCometidas,
            int penaltiPerdido
    ) {

        double pontuacao = 0;

        pontuacao += assistencias * 5.0;
        pontuacao += desarmes * 1.5;
        pontuacao += gols * 8.0;
        pontuacao += naTrave * 3;
        pontuacao += defendidos * 1.2;
        pontuacao += faltasSofridas * 0.5;
        pontuacao += golContra * - 3;
        pontuacao += cartaoAmarelo * - 1;
        pontuacao += cartaoVermelho * - 3;
        pontuacao += faltasCometidas * - 0.3;
        pontuacao += penaltiPerdido * - 2;

        return pontuacao;
    }
}
