package rafaelparenza.com.criptomoeda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonE = findViewById(R.id.activity_login_button_entrar);
        buttonE.setOnClickListener(this);
    }

    public void goMenu() {
       Intent intent = new Intent(this, TelaPrincipal.class);
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {
        if (v == buttonE) {
            goMenu();
        }
    }


}
