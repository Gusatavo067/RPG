abstract class Personagem{

    protected String nomeTipo;
    protected double saude;
    protected double forca;
    protected double destreza;
    protected Arma arma;

    public Personagem(String nome,double saude,double forca, double destreza, Arma arma){
        this.nomeTipo = nome;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;
    }
    public void printStatus(){
        if (this.estaMorto()) {
            System.out.println(this.nomeTipo + " [Morreu, Forca: " + this.forca + ", Destreza: " + this.destreza + ", " + this.arma.getNome() + "]");
        } else {
            System.out.println(this.nomeTipo + " [Saude: " + this.saude + ", Forca: " + this.forca + ", Destreza: " + this.destreza + ", " + this.arma.getNome() + "]");
        }
    }


    
     
    abstract void atacar(Personagem b);

    abstract double calcularDano();

    protected void recebeDano(double pontosDano){
        this.saude -= pontosDano;
    }
    protected boolean estaMorto(){
        return this.saude < 1.0;
    }
}
