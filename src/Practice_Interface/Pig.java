package Practice_Interface;

public class Pig implements IAnimal,IFlyable {

    @Override
    public void animalSound() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void run() {
        IFlyable.super.show();
    }
}
