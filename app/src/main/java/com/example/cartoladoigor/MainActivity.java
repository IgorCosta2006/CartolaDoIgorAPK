package com.example.cartoladoigor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editDesarmes;
    EditText editGols;
    EditText editNaTrave;
    EditText editDefendidas;
    EditText editFaltasSofridas;
    EditText editGolsContra;
    EditText editCartoesAmarelos;
    EditText editCartoesVermelhos;
    EditText editAssistencias;
    EditText editFaltasCometidas;
    EditText editPenaltisPerdidos;

    Button btnCalcular;
    TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Ligando os campos do XML ao Java
        editDesarmes = findViewById(R.id.editDesarmes);
        editGols = findViewById(R.id.editGols);
        editNaTrave = findViewById(R.id.editNaTrave);
        editDefendidas = findViewById(R.id.editDefendidas);
        editFaltasSofridas = findViewById(R.id.editFaltasSofridas);
        editGolsContra = findViewById(R.id.editGolsContra);
        editCartoesAmarelos = findViewById(R.id.editCartoesAmarelos);
        editCartoesVermelhos = findViewById(R.id.editCartoesVermelhos);
        editAssistencias = findViewById(R.id.editAssistencias);
        editFaltasCometidas = findViewById(R.id.editFaltasCometidas);
        editPenaltisPerdidos = findViewById(R.id.editPenaltisPerdidos);

        btnCalcular = findViewById(R.id.btnCalcular);
        textResultado = findViewById(R.id.textResultado);

        // Quando clicar no botão
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Pegando os valores digitados

                int desarmes = Integer.parseInt(
                        editDesarmes.getText().toString()
                );

                int gols = Integer.parseInt(
                        editGols.getText().toString()
                );

                int naTrave = Integer.parseInt(
                        editNaTrave.getText().toString()
                );

                int defendidos = Integer.parseInt(
                        editDefendidas.getText().toString()
                );

                int faltasSofridas = Integer.parseInt(
                        editFaltasSofridas.getText().toString()
                );

                int golContra = Integer.parseInt(
                        editGolsContra.getText().toString()
                );

                int cartaoAmarelo = Integer.parseInt(
                        editCartoesAmarelos.getText().toString()
                );

                int cartaoVermelho = Integer.parseInt(
                        editCartoesVermelhos.getText().toString()
                );

                int assistencias = Integer.parseInt(
                        editAssistencias.getText().toString()
                );

                int faltasCometidas = Integer.parseInt(
                        editFaltasCometidas.getText().toString()
                );

                int penaltiPerdido = Integer.parseInt(
                        editPenaltisPerdidos.getText().toString()
                );


                // Chamando a sua classe CalculadoraPontuacao
                double resultado = CalculadoraPontuacao.calcular(
                        assistencias,
                        desarmes,
                        gols,
                        naTrave,
                        defendidos,
                        faltasSofridas,
                        golContra,
                        cartaoAmarelo,
                        cartaoVermelho,
                        faltasCometidas,
                        penaltiPerdido
                );


                // Mostrando o resultado na tela
                textResultado.setText(
                        "Pontuação total: " + resultado
                );
            }
        });


        // Código original do Android Studio
        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.main),
                (v, insets) -> {

                    Insets systemBars =
                            insets.getInsets(
                                    WindowInsetsCompat.Type.systemBars()
                            );

                    v.setPadding(
                            systemBars.left,
                            systemBars.top,
                            systemBars.right,
                            systemBars.bottom
                    );

                    return insets;
                }
        );
    }
}