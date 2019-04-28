package rafaelparenza.com.criptomoeda.data;

import java.util.ArrayList;
import java.util.List;

public class EmExecucaoDatasourceHelper {


    private List<EmExecucao> datasourceEmExecucao;


    public EmExecucaoDatasourceHelper(){
        datasourceEmExecucao = new ArrayList<>();
        datasourceEmExecucao.add(new EmExecucao(2437291, "ETH", "Ordem de compra"));
        datasourceEmExecucao.add(new EmExecucao(2435910, "BTC", "Ordem de venda"));
    }

    public List<EmExecucao> getDatasourceBtc() {
        return datasourceEmExecucao;
    }
}

