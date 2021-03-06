import Fly.FlyNoWay;
import Fly.FlyWithWings;
import Fly.IFlyBehaviour;
import Quack.IQuackBehaviour;
import Quack.Quack;
import Quack.Squeek;
import Quack.MuteQuack;

public class MainClass {
    public static void main(String[] args) {

        // Red Head Duck
        IFlyBehaviour flyBehaviour = new FlyWithWings();
        IQuackBehaviour quackBehaviour = new Quack();

        Duck redHeadDuck = new RedHeadDuck();
        
        redHeadDuck.setFlyBehaviour(flyBehaviour);      
        redHeadDuck.setQuackBehaviour(quackBehaviour);

        System.out.print("redHeadDuck: ");
        redHeadDuck.performQuack();
        System.out.print("redHeadDuck: ");
        redHeadDuck.performFly();

        // Rubber Duck
        IFlyBehaviour noFlyBehaviour = new FlyNoWay();
        IQuackBehaviour squeekBehaviour = new Squeek();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.setQuackBehaviour(squeekBehaviour);
        rubberDuck.setFlyBehaviour(noFlyBehaviour);

        System.out.print("rubberDuck: ");
        rubberDuck.performFly();
        System.out.print("rubberDuck: ");
        rubberDuck.performQuack();

        // Wodden Duck
        IQuackBehaviour noQuackBehaviour = new MuteQuack();

        Duck woddenDuck = new WoddenDuck();
        woddenDuck.setFlyBehaviour(noFlyBehaviour);
        woddenDuck.setQuackBehaviour(noQuackBehaviour);
        
        System.out.print("woddenDuck: ");
        woddenDuck.performQuack();
        System.out.print("woddenDuck: ");
        woddenDuck.performFly();
    }
}
