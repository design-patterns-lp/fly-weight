package flyweight;

public class Paciente {
    private String nome;
    private Ala ala;
    
    public Paciente(String nome, Ala ala){
        this.nome = nome;
        this.ala = ala;
    }

    public String obterPaciente(){
        return "Paciente{" +
        "nome='" + this.nome + '\'' +
        ", ala='" + ala.getNome() + '\'' +
        ", andar='" + ala.getAndar() + '\'' +
        '}';
    }
}
