package facade;

import flyweight.AlaFactory;
import flyweight.Hospital;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class HospitalTeste {
    @Test
    void deveRetornarPacientes(){
        Hospital hospital = new Hospital();
        hospital.cadastrar("João da Silva", 1, "Psiquiatria");
        hospital.cadastrar("Pedro Alves", 1, "Psiquiatria");
        hospital.cadastrar("Mariana Costa", 1, "Psiquiatria");
        hospital.cadastrar("Carlos Oliveira", 5, "Oncologia");


    List<String> output = Arrays.asList(
        "Paciente{nome='João da Silva', ala='Psiquiatria', andar='1'}",
        "Paciente{nome='Pedro Alves', ala='Psiquiatria', andar='1'}",
        "Paciente{nome='Mariana Costa', ala='Psiquiatria', andar='1'}",
        "Paciente{nome='Carlos Oliveira', ala='Oncologia', andar='5'}"
    );

    
        assertEquals(output, hospital.obterPacientes());
    }


    @Test
    void deveRetornarTotalAlas(){
        Hospital hospital = new Hospital();
        hospital.cadastrar("João da Silva", 1, "Psiquiatria");
        hospital.cadastrar("Pedro Alves", 1, "Psiquiatria");
        hospital.cadastrar("Mariana Costa", 1, "Psiquiatria");
        hospital.cadastrar("Carlos Oliveira", 5, "Oncologia");
    
        assertEquals(2, AlaFactory.getTotalAlas());
    }
    
}
