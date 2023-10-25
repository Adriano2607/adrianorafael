public class Venda {
    private Integer quantidade;
    private Double valor;

    public Venda(Integer quantidade, Double valor){
        this.quantidade=quantidade;
        this.valor=valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getValor() {
        return valor;
    }
}