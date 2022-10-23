import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //      String phone = "+7(999)-79 4516!";
        //    phone = phone.replace("-", "");
        //  phone = phone.replace(" ", "");
        // phone = phone.replace("(", "");
        // phone = phone.replace(")", "");
        // phone = phone.replace("+", "");
        // if (phone.length() == 10) {
        //     phone = '7' + phone;
        // } else if (phone.length() > 11) {
        //    throw new RuntimeException("Телефон слишком длинный");
        // } else if (phone.length() < 10) {
        //    throw new RuntimeException("Телефон слишком короткий");
        // } else if (phone.length() == 11 && phone.charAt(0) != '7') {
        //    throw new RuntimeException("Среди нас посторонний");
        //}
        // System.out.println("phone = " + phone);
        // String expectedPhone = "79994537916";
        // if (phone.equals(expectedPhone)) {
        //    System.out.println("Успех!");
        // } else {
        //    System.out.println("Неудача!");
        // }

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
