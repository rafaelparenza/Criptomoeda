package rafaelparenza.com.criptomoeda;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;

public class ConfigActivity extends AppCompatActivity {

    private RadioButton radioButtonMenorValor;
    private RadioButton radioButtonMaiorValor;
    private RadioButton radioButtonmaiorvalorizacao;
    private RadioButton radioButtonmenorvalorizacao;
    private Switch aSwitchNotificacao;

    @Override
    public boolean moveDatabaseFrom(Context sourceContext, String name) {
        return super.moveDatabaseFrom(sourceContext, name);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
        radioButtonMaiorValor = findViewById(R.id.activity_config_radiobutton_maiormenorvalor);
        radioButtonMenorValor = findViewById(R.id.activity_config_radiobutton_menormaiorvalor);
        radioButtonmaiorvalorizacao = findViewById(R.id.activity_config_radiobutton_maiorvalorizacao);
        radioButtonmenorvalorizacao = findViewById(R.id.activity_config_radiobutton_menorvalorizacao);
        aSwitchNotificacao = findViewById(R.id.activity_config_switch_notificacoes);
    }

}
