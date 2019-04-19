package rafaelparenza.com.criptomoeda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaLogin extends AppCompatActivity implements View.OnClickListener {
    private Button entrarButton;
    private Button cadastrarButton;
    private EditText loginEditText;
    private EditText senhaEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
        entrarButton.findViewById(R.id.activity_tela_login_button_entrar);
        cadastrarButton.findViewById(R.id.activity_tela_login_button_cadastrar);
        entrarButton.setOnClickListener(this);
        cadastrarButton.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {

    }
}
