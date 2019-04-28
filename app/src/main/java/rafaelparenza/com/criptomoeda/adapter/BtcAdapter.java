package rafaelparenza.com.criptomoeda.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import rafaelparenza.com.criptomoeda.R;
import rafaelparenza.com.criptomoeda.data.Ordens;

import java.util.List;

public class BtcAdapter extends RecyclerView.Adapter<BtcAdapter.btcItemViewHolder> {

    private List<Ordens> datasourceBtc;

    // Recebe o datasource como parâmetro do contrutor que será chamado pela Activity que irá instanciar o Adapter
    public BtcAdapter(List<Ordens> datasourceBtc)  {this.datasourceBtc = datasourceBtc; }

    // Método responsável por criar o ViewHolder. Para tanto, é necessário passar ao ViewHolder
    // qual é a View (row_movie) referente a cada um dos itens da lista.
    // Para carregar o XML, utilizamos o LayoutInflater que irá instanciar os objetos referentes à todos os componentes do XML.
    // O LayoutInflater retorna a View que utilizaremos para instanciar o ViewHolder.
    @NonNull
    @Override
    public btcItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.activity_inflate_ver_detalhes, viewGroup, false);
        return new btcItemViewHolder(view);
    }

    // Método responsável por "pegar" o ViewHolder que é passado por parâmetro e "preencher" nele os dados do item
    // do datasource na posição representada pelo parâmetro index.
    // Utilizamos um método auxiliar no ViewHolder (fillMovie) para "preencher" os dados.
    @Override
    public void onBindViewHolder(@NonNull btcItemViewHolder movieItemViewHolder, int index) {
        movieItemViewHolder.fillBtcOrdens(datasourceBtc.get(index));
    }

    @Override
    public int getItemCount() {
        return datasourceBtc.size();
    }


    public final static class btcItemViewHolder extends RecyclerView.ViewHolder {

        private TextView codigoTextView;
        private TextView ordemTextView;
        private TextView quantidadeTextView;
        private TextView precoTextView;
        private TextView dataTextView;

        public btcItemViewHolder(@NonNull View itemView) {
            super(itemView);

            codigoTextView = itemView.findViewById(R.id.row_btc_codigo_textview);
            ordemTextView = itemView.findViewById(R.id.row_btc_ordem_textview);
            quantidadeTextView = itemView.findViewById(R.id.row_btc_quantidade_textview);
            precoTextView = itemView.findViewById(R.id.row_btc_preco_textview);
            dataTextView = itemView.findViewById(R.id.row_btc_data_textview);
        }


        private void fillBtcOrdens(Ordens ordens){
            codigoTextView.setText("Código: "+ ordens.getCodigo());
            ordemTextView.setText("Ordem: "+ ordens.getOrdem());
            quantidadeTextView.setText("Quantidade: "+ ordens.getQuantidade());
            precoTextView.setText("Preço: "+ ordens.getPreco());
            dataTextView.setText("Data: "+ ordens.getData());
        }




    }



}
