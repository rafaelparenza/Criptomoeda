package rafaelparenza.com.criptomoeda.data;

import java.util.ArrayList;
import java.util.List;

public class BtcDatasourceHelper {

    private List<Ordens> datasourceBtc;

    public BtcDatasourceHelper(){
        datasourceBtc = new ArrayList<>();
        datasourceBtc.add(new Ordens("57774182", "Compra", "0.03081", "14.952", "10/01/2019"));
        datasourceBtc.add(new Ordens("57773213", "Compra", "0.22452", "14.952", "10/01/2019"));
        datasourceBtc.add(new Ordens("57462655", "Venda", "0.01343", "14.952", "10/01/2019"));
        datasourceBtc.add(new Ordens("57774182", "Compra", "0.11345", "14.952", "10/01/2019"));
        datasourceBtc.add(new Ordens("57774182", "Venda", "0.03097", "14.952", "10/01/2019"));
        datasourceBtc.add(new Ordens("57774182", "Venda", "0.34112", "14.952", "10/01/2019"));
    }

    public List<Ordens> getDatasourceBtc() {
        return datasourceBtc;
    }
}
