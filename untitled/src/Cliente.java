import java.util.Scanner;

public class Cliente {
    private int id;
    private String nome;
    private String sexo;
    private String telefone;
    private String endereco;

    public Cliente(String nome, String sexo, String telefone, String endereco) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public boolean validaTelefone(Cliente cliente){
        if (cliente.getTelefone().length()==9)
            return true;

        return false;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }
}
