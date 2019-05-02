package rafaelparenza.com.criptomoeda.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import rafaelparenza.com.criptomoeda.R;
import rafaelparenza.com.criptomoeda.data.EmExecucao;

import java.util.List;

public class EmExecucaoAdapter extends RecyclerView.Adapter<EmExecucaoAdapter.emExecucaoItemViewHolder> {

    private List<EmExecucao> datasourceemExecucao;

    // Recebe o datasource como parâmetro do contrutor que será chamado pela Activity que irá instanciar o Adapter
    public EmExecucaoAdapter(List<EmExecucao> datasourceemExecucao)  {this.datasourceemExecucao = datasourceemExecucao; }



    @NonNull
    @Override
    public emExecucaoItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.activity_inflate_em_execucao, viewGroup, false);
        return new emExecucaoItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull emExecucaoItemViewHolder emExecucaoItemViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return datasourceemExecucao.size();
    }


    public final static class emExecucaoItemViewHolder extends RecyclerView.ViewHolder {

        private TextView codigoTextView;


        public emExecucaoItemViewHolder(@NonNull View itemView) {
            super(itemView);

            codigoTextView = itemView.findViewById(R.id.row_em_execucao);
        }


        private void fillEmExecucao(EmExecucao emExecucao){
            codigoTextView.setText("#"+ emExecucao.getCodigo() + "("+ emExecucao.getSigla() + ")"+ "->"+emExecucao.getTipoOrdem());
         }
    }

}
