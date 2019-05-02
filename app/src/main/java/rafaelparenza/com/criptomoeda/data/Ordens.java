package rafaelparenza.com.criptomoeda.data;

import java.util.Date;

public class Ordens {

    private String codigo;
    private String ordem;
    private String quantidade;
    private String preco;
    private String data;


    public Ordens(String codigo, String ordem, String quantidade, String preco, String data) {
        this.codigo = codigo;
        this.ordem = ordem;
        this.quantidade = quantidade;
        this.preco = preco;
        this.data = data;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
