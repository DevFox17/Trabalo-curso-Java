package Médico;

public class medico {

    private String nome;
    private String crm;
    private String especialidade;

    public String getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setEspecialidade(String espedialidade) {
        this.especialidade = espedialidade;
    }

}
