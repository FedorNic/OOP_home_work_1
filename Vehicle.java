package Home_Tasks.HT_7;

public abstract class Vehicle implements Checkable, TimeCounter {

    protected abstract void start();

    protected abstract void drive();

    protected abstract void stop();

}
