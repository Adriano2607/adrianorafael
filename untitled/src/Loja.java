import java.util.ArrayList;
import java.util.List;

public class Loja {
    private int id;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Servico> servicos;
    private List<Agendamento> agendamentos;

    public void setId(int id) {
        this.id = id;
    }

    public void addClientes(Cliente clientes) {
        this.clientes.add(clientes);
    }

    public void addServicos(Servico servicos) {
        this.servicos.add(servicos);
    }

    public int getId() {
        return id;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public int clienteTamanho(){
        return this.clientes.size();
    }


    public int servicoTamanho(){
        return this.servicos.size();
    }

    public int agendamentoTamanho(){
        return this.agendamentos.size();
    }
    public void agendarAtendimento(Agendamento agendamento){
        this.agendamentos.add(agendamento);
    }
}
