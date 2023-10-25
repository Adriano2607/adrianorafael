public class Servico {
    private int id;
    private String nome;
    private String descricao;
    private Double valor;

    public Servico(String nome, String descricao, Double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
}
