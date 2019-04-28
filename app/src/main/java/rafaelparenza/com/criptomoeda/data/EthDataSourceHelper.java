package rafaelparenza.com.criptomoeda.data;

import java.util.ArrayList;
import java.util.List;

public class EthDataSourceHelper {

    private List<Ordens> datasourceEth;

    public EthDataSourceHelper(){
        datasourceEth = new ArrayList<>();
        datasourceEth.add(new Ordens("57774182", "Compra", "0.03081", "653,78", "10/01/2019"));
        datasourceEth.add(new Ordens("57773213", "Compra", "0.22452", "670,55", "10/01/2019"));
        datasourceEth.add(new Ordens("57462655", "Venda", "0.01343", "632,55", "10/01/2019"));
        datasourceEth.add(new Ordens("57774182", "Compra", "0.11345", "690,76", "10/01/2019"));
        datasourceEth.add(new Ordens("57774182", "Venda", "0.03097", "678,44", "10/01/2019"));
        datasourceEth.add(new Ordens("57774182", "Venda", "0.34112", "702,55", "10/01/2019"));
    }

    public List<Ordens> getDatasourceEth() {
        return datasourceEth;
    }
}
