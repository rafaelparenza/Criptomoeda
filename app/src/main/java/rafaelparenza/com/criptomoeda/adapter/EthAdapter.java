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

public class EthAdapter extends RecyclerView.Adapter<EthAdapter.ethItemViewHolder>  {

    private List<Ordens> datasourceEth;

    public EthAdapter(List<Ordens> datasourceEth)  {this.datasourceEth = datasourceEth; }

    @NonNull
    @Override
    public ethItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.activity_inflate_ver_detalhes, viewGroup, false);
        return new ethItemViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ethItemViewHolder ethItemViewHolder, int i) {
        ethItemViewHolder.fillEthOrdens(datasourceEth.get(i));

    }

    @Override
    public int getItemCount() {
        return datasourceEth.size();
    }



















    public final static class ethItemViewHolder extends RecyclerView.ViewHolder {

        private TextView codigoTextView;
        private TextView ordemTextView;
        private TextView quantidadeTextView;
        private TextView precoTextView;
        private TextView dataTextView;


        public ethItemViewHolder(@NonNull View itemView) {
            super(itemView);

            codigoTextView = itemView.findViewById(R.id.row_btc_codigo_textview);
            ordemTextView = itemView.findViewById(R.id.row_btc_ordem_textview);
            quantidadeTextView = itemView.findViewById(R.id.row_btc_quantidade_textview);
            precoTextView = itemView.findViewById(R.id.row_btc_preco_textview);
            dataTextView = itemView.findViewById(R.id.row_btc_data_textview);
        }


        private void fillEthOrdens(Ordens ordensEth){
            codigoTextView.setText("Código: "+ ordensEth.getCodigo());
            ordemTextView.setText("Ordem: "+ ordensEth.getOrdem());
            quantidadeTextView.setText("Quantidade: "+ordensEth.getQuantidade());
            precoTextView.setText("Preço: "+ordensEth.getPreco());
            dataTextView.setText("Data: "+ordensEth.getData());
        }



    }



}
