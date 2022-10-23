import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        task1();
        task2();

    }

    private static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        String fuiiNameForReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fuiiNameForReport);
    }

    private static void task2() {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
