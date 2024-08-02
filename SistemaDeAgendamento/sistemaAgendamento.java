package SistemaDeAgendamento;

import java.util.Scanner;

import Agendamento.agendamento;
import Médico.medico;
import Paciente.paciente;

public class sistemaAgendamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        medico Médico = new medico();
        paciente Paciente = new paciente();
        agendamento Agendamento = new agendamento();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Médico");
            System.out.println("2. Cadastrar Paciente");
            System.out.println("3. Agendar Consulta");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Nome do Médico: ");
                Médico.setNome(scanner.nextLine());

                System.out.println("CRM do Médico: ");
                Médico.setCrm(scanner.nextLine());

                System.out.println("Especialidade do Médico: ");
                Médico.setEspecialidade(scanner.nextLine());
                System.out.println("Médico cadastrado com sucesso!\n");
            }

            else if (opcao == 2) {
                System.out.println("Nome do paciente: ");
                Paciente.setNome(scanner.nextLine());

                System.out.println("Data de nascimento do paciente: ");
                Paciente.setDataNascimento(scanner.nextLine());

                System.out.println("CPF do paciente: ");
                Paciente.setCpf(scanner.nextLine());

                System.out.println("Paciente cadastrado com sucesso!\n");

            }

            else if (opcao == 3) {
                System.out.println("Data da consulta: ");
                Agendamento.setData(scanner.nextLine());
                Agendamento.setMedico(Médico);
                Agendamento.setPaciente(Paciente);
                System.out.println(Agendamento.agendar());

                System.out.println("Consulta agendada com sucesso!\n");
            }

            else if (opcao == 4) {
                System.out.println("Saino do sistema...");
                break;
            } else {
                System.out.println("Opção Inválida! Tente novamente. \n");
            }

        }

        scanner.close();
    }
}
