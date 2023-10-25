import java.util.Scanner;

public class Criador {

    Loja loja = new Loja();

    public Cliente cliente(String nome, String sexo, String telefone, String endereco){
        if(nome.equals("")||sexo.equals("")||telefone.equals("")||endereco.equals(""))
        return null;

        Cliente a = new Cliente(nome, sexo,telefone,endereco);
        a.setId(loja.clienteTamanho()+1);

        if (!a.validaTelefone(a))
            return null;

        loja.addClientes(a);

        return a;
    }

    public Servico servico(String nome, String descricao, Double valor){
        if (nome.equals(""))
            return null;

        Servico a = new Servico(nome,descricao,valor);
        a.setId(loja.servicoTamanho()+1);
        loja.addServicos(a);
        return a;
    }

    public Agendamento agendamento(Cliente cliente, Servico servico, String data){
        if (cliente==null||servico==null)
            return null;

        Agendamento a = new Agendamento(cliente,servico, data);
        a.setId(loja.agendamentoTamanho()+1);
        loja.agendarAtendimento(a);
        return a;
    }
}
