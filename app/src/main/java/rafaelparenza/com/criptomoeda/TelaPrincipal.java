package rafaelparenza.com.criptomoeda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaPrincipal extends AppCompatActivity {

    private TextView valorAtualBTC;
    private TextView valorizacaoBTC;
    private TextView btcDisponivel;
    private TextView saldoBtcDisponivel;
    private TextView valorAtualETH;
    private TextView valorizacaoETH;
    private TextView ethDisponivel;
    private TextView saldoEthDisponivel;
    private TextView valorAtualXRP;
    private TextView valorizacaoXRP;
    private TextView xrpDisponivel;
    private TextView saldoXrpDisponivel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        //buscar as referências
        valorAtualBTC = findViewById(R.id.activity_principal_valorAtualBTC);
        valorizacaoBTC = findViewById(R.id.activity_principal_valorizacaoBTC);
        btcDisponivel = findViewById(R.id.activity_principal_disponivelNegociacaoBTC);
        saldoBtcDisponivel = findViewById(R.id.activity_principal_saldoDisponivelBTC);
        valorAtualETH = findViewById(R.id.activity_principal_valorAtualETH);
        valorizacaoETH = findViewById(R.id.activity_principal_valorizacaoETH);
        ethDisponivel = findViewById(R.id.activity_principal_disponivelNegociacaoETH);
        saldoEthDisponivel = findViewById(R.id.activity_principal_saldoDisponivelETH);
        valorAtualXRP = findViewById(R.id.activity_principal_valorAtualETH);
        valorizacaoETH = findViewById(R.id.activity_principal_valorizacaoETH);
        ethDisponivel = findViewById(R.id.activity_principal_disponivelNegociacaoETH);
        saldoEthDisponivel = findViewById(R.id.activity_principal_saldoDisponivelETH);



        valorAtualBTC.setText("Valor atual: R$ " + "21.116,08");
        valorizacaoBTC.setText("Valorização: "+ "+0,79%");
        btcDisponivel.setText("Disponível para negociação: " + "0.002365");
        saldoBtcDisponivel.setText("Saldo disponível: R$"+"35,75");
        valorizacaoETH.setText("Valor atual: R$ " + "653,99");
        valorizacaoETH.setText("Valorização: "+ "-0,76%");
        ethDisponivel.setText("Disponível para negociação: " + "0.012");
        saldoEthDisponivel.setText("Saldo disponível: R$"+"35,75");
        valorAtualXRP.setText("Valor atual: R$ " + "1,31");
        valorizacaoXRP.setText("Valorização: "+ "-0,76%");
        xrpDisponivel.setText("Disponível para negociação: " + "2.574");
        saldoXrpDisponivel.setText("Saldo disponível: R$"+"35,75");

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
