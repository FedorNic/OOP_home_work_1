package Home_Tasks.HT_7;

import java.util.List;

public class GasalineCar extends Car{
    public GasalineCar() {
        engine = new GasalineEngine();
        front_wheel_1 = new Wheel();
        front_wheel_2 = new Wheel();
        rear_wheel_1 = new Wheel();
        rear_wheel_2 = new Wheel();
        handlebar = new Handlebar();
        front_brake = new Brake();
        rear_brake = new Brake();
        seat = new Seat();
        checkables = List.of(engine, front_wheel_1, front_wheel_2,
                rear_wheel_1, rear_wheel_2, handlebar, front_brake, rear_brake, seat);
    }

    @Override
    public void check() {
        System.out.println("Проверка систем автомобиля");
    }

    @Override
    protected void start() {
        engine.start();
    }

    @Override
    protected void drive() {
            front_wheel_1.rotate();
            front_wheel_2.rotate();
            rear_wheel_1.rotate();
            rear_wheel_2.rotate();
    }

    @Override
    protected void stop() {
        engine.stop();
        front_brake.slowdown();
        rear_brake.slowdown();
    }
    public void сheckAll() {
        for (Checkable checkables : checkables) {
            checkables.check();
        }
    }

    @Override
    public int timecounter() {
        return (int) (Math.random() * 45) + 1;
    }
}
