package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Paciente> pacientes = new ArrayList<>();

    public void cadastrar(String nomePaciente, Integer andar, String nomeAla){
        Ala ala = AlaFactory.getAla(andar, nomeAla);
        Paciente paciente = new Paciente(nomePaciente, ala);
        pacientes.add(paciente);
    }

    public List<String> obterPacientes(){
        List<String> output = new ArrayList<>();
        for(Paciente paciente: this.pacientes){
            output.add(paciente.obterPaciente());
        }
        return output;
    }
}
