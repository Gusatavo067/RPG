abstract class ArmaClerigo extends Arma{
    public ArmaClerigo(String nome, double modificadorDano) {
        super(nome, modificadorDano);
    }
}
class Martelo extends ArmaClerigo{
    public Martelo(){
        super("Martelo",0.6);
    }
}
class Maca extends ArmaClerigo{
    public Maca(){
        super("Maca", 0.4);
    }
}