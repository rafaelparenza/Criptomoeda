package rafaelparenza.com.criptomoeda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import rafaelparenza.com.criptomoeda.adapter.XrpAdapter;
import rafaelparenza.com.criptomoeda.data.Ordens;
import rafaelparenza.com.criptomoeda.data.XrpDatasourceHelper;

public class VerDetalhesXRP extends AppCompatActivity {

   // private RecyclerView xrpRecyclerView;
    private List<Ordens> datasourceOrdensXrp;
    private XrpAdapter xrpAdapter;

    private EditText precoCompraSugerido;
    private EditText precoVendaSugerido;
    private TextView quantidadeDisponivelNegociacao;
    private TextView saldoDisponivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_detalhes_xrp);

        //buscar referencias
     //   xrpRecyclerView = findViewById(R.id.activity_principal_recycler_view_ordensXRP);
        precoCompraSugerido = findViewById(R.id.activity_verXRP_preco_comprar);
        precoVendaSugerido = findViewById(R.id.activity_verXRP_preco_vender);
        quantidadeDisponivelNegociacao = findViewById(R.id.activity_verXRP_quantidade_disponivel);
        saldoDisponivel = findViewById(R.id.activity_verXRP_saldo_disponivel);


        XrpDatasourceHelper helper = new XrpDatasourceHelper();
        datasourceOrdensXrp = helper.getDatasourceXrp();

        xrpAdapter = new XrpAdapter(datasourceOrdensXrp);


       // LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        //xrpRecyclerView.setAdapter(xrpAdapter);
        //xrpRecyclerView.setLayoutManager(layoutManager);

        //concatenar e dar valor na tela da activity
        precoCompraSugerido.setText("1,31");
        precoVendaSugerido.setText("1,33");
        quantidadeDisponivelNegociacao.setText("RIPPLE DISPONÍVEL:" + "0.00236500" + "ETH");
        saldoDisponivel.setText("SALDO DISPONÍVEL: R$" + "35,75");

    }
}
