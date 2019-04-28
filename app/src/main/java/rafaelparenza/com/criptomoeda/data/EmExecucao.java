package rafaelparenza.com.criptomoeda.data;

public class EmExecucao {

    private int codigo;
    private String sigla;
    private String tipoOrdem;

    public EmExecucao(int codigo, String sigla, String tipoOrdem) {
        this.codigo = codigo;
        this.sigla = sigla;
        this.tipoOrdem = tipoOrdem;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTipoOrdem() {
        return tipoOrdem;
    }

    public void setTipoOrdem(String tipoOrdem) {
        this.tipoOrdem = tipoOrdem;
    }
}

