package Practice_Interface;

public interface IFlyable {
    public void fly();
    public void run();
    default void show(){
        System.out.println("show me");
    }
}
