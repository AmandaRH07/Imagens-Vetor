package br.ifsc.edu.imc_plus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    List<Integer> listaImagens;
     int contadorPosicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        listaImagens = Arrays.asList(
                R.drawable.cachorro,
                R.drawable.patinho,
                R.drawable.gardem,
                R.drawable.porquinho,
                R.drawable.happy);
        contadorPosicao=0;
    }

    public void mudaFoto(View view) {
        if(contadorPosicao<listaImagens.size()-1){
            imageView.setImageResource(listaImagens.get(contadorPosicao));
        } else {
            contadorPosicao =0;
            imageView.setImageResource(listaImagens.get(contadorPosicao));
        }
        contadorPosicao++;

    }
}
