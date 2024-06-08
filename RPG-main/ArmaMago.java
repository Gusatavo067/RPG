abstract class ArmaMago extends Arma{
    public ArmaMago(String nome, double modificadorDano) {
        super(nome, modificadorDano);
    }
}

class Transmutacao extends ArmaMago{
    public Transmutacao(){
        super("Transmutacao", 0.25);
    }
}
class Psikappa extends Arma{
    public Psikappa(){
        super("Psikappa", 0.5);
    }

}

