package rafaelparenza.com.criptomoeda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
    }




    public void DetalhesBTC(View view) {
        Intent intent = new Intent(this, VerDetalhesBTC.class);
        startActivity(intent);

    }


    public void DetalhesETH(View view) {
        Intent intent = new Intent(this, VerDetalhesETH.class);
        startActivity(intent);

    }

    public void DetalhesXRP(View view) {
        Intent intent = new Intent(this, VerDetalhesXRP.class);
        startActivity(intent);
    }



}
