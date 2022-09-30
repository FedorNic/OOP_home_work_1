package Home_Tasks.HT_7;

public class GasalineEngine extends Engine {

    @Override
    protected void start() {
        System.out.println("Бензиновый двигатель запущен");
    }

    @Override
    protected void stop() {
        System.out.println("Бензиновый двигатель остановлен");
    }

    @Override
    public void check() {
        System.out.println("Проверка уровня топлива");
    }
}
