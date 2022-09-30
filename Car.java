package Home_Tasks.HT_7;

import java.util.List;

public abstract class Car extends Vehicle{
    protected Engine engine;
    protected Wheel front_wheel_1;
    protected Wheel front_wheel_2;
    protected Wheel rear_wheel_1;
    protected Wheel rear_wheel_2;
    protected Seat seat;
    protected Handlebar handlebar;
    protected Brake front_brake;
    protected Brake rear_brake;
    protected List<Checkable> checkables;
}
