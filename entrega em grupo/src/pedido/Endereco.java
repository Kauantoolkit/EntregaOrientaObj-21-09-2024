package pedido;

public class Endereco {
    private String cep;
    private String cidade;
    private String rua;
    private String numero;
    private boolean enderecoAtual;

    public Endereco(String cep, String cidade, String rua, String numero, boolean enderecoAtual) {
        this.cep = cep;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.enderecoAtual = enderecoAtual;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isEnderecoAtual() {
        return enderecoAtual;
    }

    public void setEnderecoAtual(boolean enderecoAtual) {
        this.enderecoAtual = enderecoAtual;
    }


        @Override
    public String toString() {
        return rua + ", " + numero + ", " + cidade + ", " + cep;
    }
}


