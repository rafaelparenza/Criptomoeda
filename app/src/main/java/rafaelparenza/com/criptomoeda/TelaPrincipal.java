package rafaelparenza.com.criptomoeda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaPrincipal extends AppCompatActivity implements View.OnClickListener {

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

    private Button buttonMenu;
    private Button buttonConfig;
    private Button buttonVerDetalhesXRP;
    private Button buttonVerDetalhesETH;
    private Button buttonVerDetalhesBTC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        //buscar as referências
        buttonMenu = findViewById(R.id.activity_principal_button_configuracoes);
        buttonConfig = findViewById(R.id.activity_principal_button_menu);
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
        buttonVerDetalhesXRP = findViewById(R.id.activity_principal_button_verDetalhesXRP);
        buttonVerDetalhesETH = findViewById(R.id.activity_principal_button_verDetalhesBTC);
        buttonVerDetalhesBTC = findViewById(R.id.activity_principal_button_verDetalhesETH);

        buttonMenu.setOnClickListener(this);
        buttonConfig.setOnClickListener(this);
        buttonVerDetalhesBTC.setOnClickListener(this);
        buttonVerDetalhesETH.setOnClickListener(this);
        buttonVerDetalhesXRP.setOnClickListener(this);


        valorAtualBTC.setText("Valor atual: R$ " + "21.116,08");
        valorizacaoBTC.setText("Valorização: " + "+0,79%");
        btcDisponivel.setText("Disponível para negociação: " + "0.002365");
        saldoBtcDisponivel.setText("Saldo disponível: R$" + "35,75");
        valorizacaoETH.setText("Valor atual: R$ " + "653,99");
        valorizacaoETH.setText("Valorização: " + "-0,76%");
        ethDisponivel.setText("Disponível para negociação: " + "0.012");
        saldoEthDisponivel.setText("Saldo disponível: R$" + "35,75");
        valorAtualXRP.setText("Valor atual: R$ " + "1,31");
        valorizacaoXRP.setText("Valorização: " + "-0,76%");
        xrpDisponivel.setText("Disponível para negociação: " + "2.574");
        saldoXrpDisponivel.setText("Saldo disponível: R$" + "35,75");

    }


    public void DetalhesBTC() {
        Intent intent = new Intent(this, VerDetalhesBTC.class);
        startActivity(intent);
    }

    public void DetalhesETH() {
        Intent intent = new Intent(this, VerDetalhesETH.class);
        startActivity(intent);
    }

    public void DetalhesXRP() {
        Intent intent = new Intent(this, VerDetalhesXRP.class);
        startActivity(intent);
    }

    public void Menu() {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    public void Config() {
        Intent intent = new Intent(this, ConfigActivity.class);
        startActivity(intent);
    }

    /*private void add() {
        Intent intent = new Intent(this, MovieEditActivity.class);// primeiro parametro é contexto
        startActivity(intent);
        startActivityForResult(intent, ADD_CODE);
    }*/


    @Override
    public void onClick(View v) {
        if (v == buttonMenu) {
            Menu();
        } else if (v == buttonConfig) {
            Config();
        } else if (v == buttonVerDetalhesBTC) {
            DetalhesBTC();
        } else if (v == buttonVerDetalhesETH) {
            DetalhesETH();
        } else if (v == buttonVerDetalhesXRP) {
            DetalhesXRP();
        }


    }
}
