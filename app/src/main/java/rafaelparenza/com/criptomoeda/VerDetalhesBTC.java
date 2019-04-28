package rafaelparenza.com.criptomoeda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import rafaelparenza.com.criptomoeda.adapter.BtcAdapter;
import rafaelparenza.com.criptomoeda.data.Ordens;
import rafaelparenza.com.criptomoeda.data.BtcDatasourceHelper;

public class VerDetalhesBTC extends AppCompatActivity {

    private RecyclerView btcRecyclerView;
    private List<Ordens> datasourceOrdens;
    private BtcAdapter btcAdapter;

    private EditText precoCompraSugerido;
    private EditText precoVendaSugerido;
    private TextView quantidadeDisponivelNegociacao;
    private TextView saldoDisponivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_detalhes_btc);

        //buscar referencias
        btcRecyclerView = findViewById(R.id.activity_principal_recycler_view_ordensBTC);
        precoCompraSugerido = findViewById(R.id.activity_verBTC_preco_comprar);
        precoVendaSugerido = findViewById(R.id.activity_verBTC_preco_vender);
        quantidadeDisponivelNegociacao = findViewById(R.id.activity_verBTC_quantidade_disponivel);
        saldoDisponivel = findViewById(R.id.activity_verBTC_saldo_disponivel);


        BtcDatasourceHelper helper = new BtcDatasourceHelper();
        datasourceOrdens = helper.getDatasourceBtc();

        btcAdapter = new BtcAdapter(datasourceOrdens);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        btcRecyclerView.setAdapter(btcAdapter);
        btcRecyclerView.setLayoutManager(layoutManager);

        //concatenar e dar valor na tela da activity
        precoCompraSugerido.setText("22.020,03");
        precoVendaSugerido.setText("23.110,67");
        quantidadeDisponivelNegociacao.setText("BITCOIN DISPONÍVEL:" + "0.00236500" + "BTC");
        saldoDisponivel.setText("SALDO DISPONÍVEL: R$" + "35,75");

    }
}
