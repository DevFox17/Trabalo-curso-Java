package Agendamento;

import Médico.medico;
import Paciente.paciente;

public class agendamento {
    private paciente paciente;
    private medico medico;
    private int data;

    public String agendar() {
        return "Consulta agendada para " + paciente.getNome() + " com o Dr. " + medico.getNome() + " na data " + data;
    }

    public String consultar() {
        return "Consulta com o Dr. " + medico.getNome() + " para " + paciente.getNome() + " na data " + data;
    }

    public int cancelar() {
        return 1; // Vai indicar sucesso no cancelamento
    }

    public void setPaciente(paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(medico medico) {
        this.medico = medico;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setData(String nextLine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setData'");
    }

}
