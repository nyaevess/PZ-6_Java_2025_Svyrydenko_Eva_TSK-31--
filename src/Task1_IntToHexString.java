public class Task1_IntToHexString {

    public static void main(String[] args) {
        System.out.println(intToHexString(51966));  // Очікується: CAFE
        System.out.println(intToHexString(255));    // Очікується: FF
        System.out.println(intToHexString(0));      // Очікується: 0

        try {
            System.out.println(intToHexString(-1)); // Перевірка помилки
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    public static String intToHexString(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Число не може бути від’ємним");
        }
        return Integer.toHexString(i).toUpperCase();
    }
}
