abstract class Personagem{

    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;
    private Arma arma;

    public Personagem(String nome,double saude,double forca, double destreza, Arma arma){
        this.nomeTipo = nome;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;
    }
    public class void printStatus(){
        if (this.estaMorto()) {
            System.out.println(nomeTipo + " [Morreu, Forca: " + forca + ", Destreza: " + destreza + ", " + arma.getNome() + "]");
        } else {
            System.out.println(nomeTipo + " [Saude: " + saude + ", Forca: " + forca + ", Destreza: " + destreza + ", " + arma.getNome() + "]");
        }
    }


    
     
    public class void atacar(Personagem b){
        
    }

    private double calcularDano(){

    }
    private double recebeDano(){

    }
    private boolean estaMorto(){
        
    }
}
