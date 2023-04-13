package flyweight;

public class Ala {

    private Integer andar;
    private String nome;

    public Ala(Integer andar, String nome){
        this.andar = andar;
        this.nome = nome;
    }

    
    public Integer getAndar(){
        return andar;
    }

    public String getNome(){
        return nome;
    }

}
