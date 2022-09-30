package Home_Tasks.HT_7;

public class Brake implements Checkable{

    public void slowdown() {
        System.out.println("Тормоза включаются");
    }

    @Override
    public void check() {
        System.out.println("Проверка тормоза");
    }
}
