package Home_Tasks.HT_7;

public class ElectricEngine extends Engine {

    @Override
    protected void start() {
        System.out.println("Электрический двигатель запущен");
    }

    @Override
    protected void stop() {
        System.out.println("Электрический двигатель остановлен");
    }

    @Override
    public void check() {
        System.out.println("Проверка уровня заряда");
    }
}
