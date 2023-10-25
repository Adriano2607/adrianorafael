public class Agendamento {
    private int id;
    private Cliente cliente;
    private Servico servico;
    private String data;

    public Agendamento(Cliente cliente, Servico servico, String data) {
        this.cliente = cliente;
        this.servico = servico;
        this.data = data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public String getData() {
        return data;
    }
}
