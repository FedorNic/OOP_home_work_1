package Home_Tasks.HT_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Добро пожаловать в тестовый сервис аренды транспорта GeekBrains!");
        Thread.sleep(1500);
        System.out.println("Если Вы хотите выбрать бензиновую машину – введите цифру «1»");
        System.out.println("Если Вы хотите выбрать электромобиль – введите цифру «2»");
        System.out.println("Если Вы хотите выбрать велосипед – введите цифру «3»");
        System.out.println("Если Вы хотите выбрать мотоцикл – введите цифру «4»");
        System.out.println("Если Вы хотите выбрать электросамокат – введите цифру «5»");
        System.out.println("Завершить программу – введите цифру «0»");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 0) {
            System.out.println("Программа завершена. Спасибо, что пользуетесь нашими услугами.");
        } else {
            System.out.println();
            System.out.println("Ваш заказ обрабатывается, пожалуйста оставайтесь на линии");
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("Ваш заказ готов, можете приступать к тестированию.");
            System.out.println();
            Thread.sleep(1500);

            switch (choice) {
                case (1):
                    GasalineCar gasalineCar = new GasalineCar();
                    gasalineCar.сheckAll();
                    vehicle(gasalineCar);
                    break;
                case (2):
                    ElectroCar electroCar = new ElectroCar();
                    electroCar.сheckAll();
                    vehicle(electroCar);
                    break;
                case (3):
                    Bicycle bicycle = new Bicycle();
                    bicycle.сheckAll();
                    vehicle(bicycle);
                    break;
                case (4):
                    Motobike motobike = new Motobike();
                    motobike.сheckAll();
                    vehicle(motobike);
                    break;
                case (5):
                    ElectricScooter electricScooter = new ElectricScooter();
                    electricScooter.сheckAll();
                    vehicle(electricScooter);
                    break;
                default:
                    System.out.println("В следующий раз введите правильную цифру =)");
            }
        }
    }
    public static void vehicle(Vehicle a) throws InterruptedException {
        Thread.sleep(1500);
        System.out.println();
        a.start();
        a.drive();
        a.stop();
        Thread.sleep(1500);
        System.out.println();
        System.out.println("Ваша аренда завершена, время поездки составило " + a.timecounter() + " мин.\n" +
                "Спасибо, что пользуетесь нашими услугами.");
    }
}
