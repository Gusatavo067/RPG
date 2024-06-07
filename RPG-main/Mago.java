class Mago extends Personagem{
    public Mago(){
        super("Mago", saude, forca, destreza, arma);
    }

    public void atacar(Personagem b){
        if (estaMorto()) {
            System.out.println("O " + nomeTipo + " ataca o " + b.nomeTipo + " com " + arma.getNome() + ".");
            if (this.destreza > b.destreza) {
                double dano = calculaDano();
                b.recebeDano(dano);
                System.out.println("O ataque foi efetivo com " + dano + " pontos de dano!");
            } else if (this.destreza < b.destreza) {
                double dano = b.calculaDano();
                this.recebeDano(dano);
                System.out.println("O ataque foi inefetivo e revidado com " + dano + " pontos de dano!");
            } else {
                System.out.println("O ataque foi defendido, ninguem se machucou!");
            }
            printStatus();
            b.printStatus();
        } else {
            System.out.println("O " + nomeTipo + " não consegue atacar, pois está morto.");
        }
        private double calcularDano() {
            return this.forca * arma.getModificadorDano();
        }
    }
} 
