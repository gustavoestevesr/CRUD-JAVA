import java.util.ArrayList;
import java.util.List;

public class Sistema implements Funcionalidades {

    List<Paciente> pacientes = new ArrayList<>();

    @Override
    public void cadastrar(Paciente paciente) {
        pacientes.add( paciente ); 
    }

    @Override
    public void buscar(String nome) {
        
        if ( pacientes.isEmpty() ) {
            System.out.println("Lista vazia!");
        } else {
            boolean achei = false;
            Paciente paciente = null;
            for (Paciente p : pacientes) {
                if ( p.getNome().equals(nome) ) {
                    achei = true;
                    paciente = p;
                }
            }

            if (achei) {
                System.out.println("encontrado");
                System.out.println( paciente.toString() );
            } else {
                System.out.println("não encontrado");
            }
        }
    }

    @Override
    public void listar() {
        if ( pacientes.isEmpty() ) {
            System.out.println("Lista vazia!");
        } else {
            for (Paciente paciente : pacientes) {
                System.out.println( paciente );
            }   
        }         
    }

    @Override
    public void remover(String nomePaciente) {
        if ( pacientes.isEmpty() ) {
            System.out.println("Lista vazia!");
        } else {
            boolean achei = false;
            Paciente paciente = null;
            for (Paciente p : pacientes) {
                if ( p.getNome().equals(nomePaciente) ) {
                    achei = true;
                    paciente = p;
                }
            }

            if (achei) {
                pacientes.remove(paciente);
                System.out.println("paciente removido");
            } else {
                System.out.println("paciente não removido");
            }
        }     
    }
    
}
