package br.com.etecia.appbichinhos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDetalhes(View view) {
        Intent intent = new Intent();
        switch(view.getId()){
            case R.id.idDog :
                new Intent(MainActivity.this,Dog_Activity.class);
                startActivity(intent);
                break;
            case R.id.idGato :
                new Intent(MainActivity.this,Gato_Activity.class);
                startActivity(intent);
                break;
        }
    }
}
