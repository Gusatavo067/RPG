class Personagem{

    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;
    private Arma arma;

    public Personagem(String nomeTipo,double saude,double forca, double destreza, Arma arma){
        this.nomeTipo = nomeTipo;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;
    }
    public class void printStatus(){
        if(this.saude < 1.0){
            String status = "Morreu";
            System.out.printf("Saude: %s, Forca: %.1f, Destreza: %.1f", status, this.forca, this.destreza);
        }
        else{
            System.out.printf("Saude: %.1f, Forca: %.1f, Destreza: %.1f", this.saude, this.forca, this.destreza);
        }


    }
     
    public class void atacar(Personagem b){
        
    }
}
