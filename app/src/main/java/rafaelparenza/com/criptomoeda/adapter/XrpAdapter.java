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

public class XrpAdapter extends RecyclerView.Adapter<XrpAdapter.xrpItemViewHolder>  {

    private List<Ordens> datasourceXrp;

    public XrpAdapter(List<Ordens> datasourceXrp)  {this.datasourceXrp = datasourceXrp; }

    @NonNull
    @Override
    public xrpItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.activity_inflate_ver_detalhes, viewGroup, false);
        return new xrpItemViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull xrpItemViewHolder xrpItemViewHolder, int i) {
        xrpItemViewHolder.fillXrpOrdens(datasourceXrp.get(i));

    }

    @Override
    public int getItemCount() {
        return datasourceXrp.size();
    }



    public final static class xrpItemViewHolder extends RecyclerView.ViewHolder {

        private TextView codigoTextView;
        private TextView ordemTextView;
        private TextView quantidadeTextView;
        private TextView precoTextView;
        private TextView dataTextView;


        public xrpItemViewHolder(@NonNull View itemView) {
            super(itemView);

            codigoTextView = itemView.findViewById(R.id.row_btc_codigo_textview);
            ordemTextView = itemView.findViewById(R.id.row_btc_ordem_textview);
            quantidadeTextView = itemView.findViewById(R.id.row_btc_quantidade_textview);
            precoTextView = itemView.findViewById(R.id.row_btc_preco_textview);
            dataTextView = itemView.findViewById(R.id.row_btc_data_textview);
        }


        private void fillXrpOrdens(Ordens OrdenXrp){
            codigoTextView.setText("Código: "+ OrdenXrp.getCodigo());
            ordemTextView.setText("Ordem: "+ OrdenXrp.getOrdem());
            quantidadeTextView.setText("Quantidade: "+OrdenXrp.getQuantidade());
            precoTextView.setText("Preço: "+OrdenXrp.getPreco());
            dataTextView.setText("Data: "+OrdenXrp.getData());
        }



    }



}