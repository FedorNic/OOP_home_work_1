package Home_Tasks.HT_7;

import java.util.List;

public class Bicycle extends Bike implements TimeCounter{

    public Bicycle() {
        front_wheel_1 = new Wheel();
        rear_wheel_1 = new Wheel();
        handlebar = new Handlebar();
        front_brake = new Brake();
        rear_brake = new Brake();
        seat = new Seat();
        checkables = List.of(front_wheel_1, rear_wheel_1, handlebar, front_brake, rear_brake, seat);
    }

    @Override
    public void check() {
        System.out.println("Проверка систем велосипеда");
    }

    @Override
    protected void start() { System.out.println("Велосипед поехал"); }

    @Override
    protected void drive() {
        front_wheel_1.rotate();
        rear_wheel_1.rotate();
    }

    @Override
    protected void stop() {
        front_brake.slowdown();
        rear_brake.slowdown();
        System.out.println("Велосипед остановился");
    }

    public void сheckAll() {
        for (Checkable checkables : checkables) {
            checkables.check();
        }
    }

    @Override
    public int timecounter() {
        return (int)(Math.random()*45)+1;
    }
}
