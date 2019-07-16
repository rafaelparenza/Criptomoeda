package rafaelparenza.com.criptomoeda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    private Button buttonConfirmaDeposito;
    private Button buttonConfirmaSaque;
    private EditText editTextDeposito;
    private EditText editTextsaque;
    private TextView textViewValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //        valorAtualBTC = findViewById(R.id.activity_principal_valorAtualBTC);
        buttonConfirmaDeposito = findViewById(R.id.activity_menu_button_confirmardepoisito);
        buttonConfirmaSaque = findViewById(R.id.activity_menu_button_confirmarsaque);
        editTextDeposito = findViewById(R.id.activity_menu_edittext_deposito);
        editTextsaque = findViewById(R.id.activity_menu_edittext_sacar);
        textViewValor = findViewById(R.id.activity_menu_textview_Valor);


    }


}
