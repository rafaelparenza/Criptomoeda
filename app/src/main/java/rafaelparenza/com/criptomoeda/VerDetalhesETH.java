package rafaelparenza.com.criptomoeda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import rafaelparenza.com.criptomoeda.adapter.EthAdapter;
import rafaelparenza.com.criptomoeda.data.EthDataSourceHelper;
import rafaelparenza.com.criptomoeda.data.Ordens;

public class VerDetalhesETH extends AppCompatActivity {


    //private RecyclerView ethRecyclerView;
    private List<Ordens> datasourceOrdensEth;
    private EthAdapter ethAdapter;

    private EditText precoCompraSugerido;
    private EditText precoVendaSugerido;
    private TextView quantidadeDisponivelNegociacao;
    private TextView saldoDisponivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_detalhes_eth);


        //buscar referencias
      //  ethRecyclerView = findViewById(R.id.activity_principal_recycler_view_ordensETH);
        precoCompraSugerido = findViewById(R.id.activity_verETH_preco_comprar);
        precoVendaSugerido = findViewById(R.id.activity_verETH_preco_vender);
        quantidadeDisponivelNegociacao = findViewById(R.id.activity_veETH_quantidade_disponivel);
        saldoDisponivel = findViewById(R.id.activity_verETH_saldo_disponivel);


        EthDataSourceHelper helper = new EthDataSourceHelper();
        datasourceOrdensEth = helper.getDatasourceEth();

        ethAdapter = new EthAdapter (datasourceOrdensEth);

        /*LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        ethRecyclerView.setAdapter(ethAdapter);
        ethRecyclerView.setLayoutManager(layoutManager);*/

        //concatenar e dar valor na tela da activity
        precoCompraSugerido.setText("653,99");
        precoVendaSugerido.setText("653,99");
        quantidadeDisponivelNegociacao.setText("ETHEREUM DISPONÍVEL:" + "0.012" + "ETH");
        saldoDisponivel.setText("SALDO DISPONÍVEL: R$" + "35,75");

    }
}
