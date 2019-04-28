package rafaelparenza.com.criptomoeda.data;

import java.util.ArrayList;
import java.util.List;

public class XrpDatasourceHelper {

    private List<Ordens> datasourceXrp;

    public XrpDatasourceHelper(){
        datasourceXrp = new ArrayList<>();
        datasourceXrp.add(new Ordens("11122233", "Compra", "0.03081", "1,31", "10/01/2019"));
        datasourceXrp.add(new Ordens("22233344", "Compra", "0.22452", "1,45", "10/01/2019"));
        datasourceXrp.add(new Ordens("44433322", "Venda", "0.01343", "1,23", "10/01/2019"));
        datasourceXrp.add(new Ordens("55533312", "Compra", "0.11345", "1,32", "10/01/2019"));
        datasourceXrp.add(new Ordens("77788855", "Venda", "0.03097", "1,25", "10/01/2019"));

    }

    public List<Ordens> getDatasourceXrp() {
        return datasourceXrp;
    }
}
