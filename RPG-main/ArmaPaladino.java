abstract class ArmaPaladino extends Arma{
    public ArmaPaladino(String nome, double modificadorDano) {
        super(nome, modificadorDano);
    }
}
class Espada extends ArmaPaladino{
    public Espada(){
        super("Espada", 0.3);
    }
}
class Lanca extends ArmaPaladino{
    public Lanca(){
        super("Lanca", 0.5);
    }
}
