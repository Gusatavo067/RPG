abstract class Arma{

    private String nome;
    private double modDano;

    public class Arma(String nome, double modificador){
        this.nome = nome;
        this.modDano = modificador;
    }

    public String getNome(){
        return this.nome;
    }
    public double getModificadorDano(){
        return this.modDano;
    }
}