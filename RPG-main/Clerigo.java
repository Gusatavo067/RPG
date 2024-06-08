class Clerigo extends Personagem{
    public Clerigo(double saude, double forca, double destreza, Arma arma){
        super("Clerigo", saude, forca, destreza, arma);
    }
    public void atacar(Personagem b){
        if (!estaMorto()) {
            System.out.println("O " + super.nomeTipo + " ataca o " + b.nomeTipo + " com " + this.arma.getNome() + ".");
            if (this.destreza > b.destreza) {
                double dano = calcularDano();
                b.recebeDano(dano);
                System.out.println("O ataque foi efetivo com " + dano + " pontos de dano!");
            } else if (this.destreza < b.destreza) {
                double dano = b.calcularDano();
                this.recebeDano(dano);
                System.out.println("O ataque foi inefetivo e revidado com " + dano + " pontos de dano!");
            } else {
                System.out.println("O ataque foi defendido, ninguem se machucou!");
            }
            printStatus();
            b.printStatus();
        } else {
            System.out.println("O " + super.nomeTipo + " não consegue atacar, pois está morto.");
        }
    }
    protected double calcularDano() {
        return this.forca * arma.getModificadorDano();
    }
}