public class Task2_AlphaNumericCount {

    public static void main(String[] args) {
        String text1 = "The user with the nickname koala757677 this month wrote 3 times more comments than the";
        String text2 = "abc123 456 def xyz99z test42a";
        String text3 = "OnlyWordsAndNumbers 123 4567 test100a";

        System.out.println(countAlphaNumeric(text1)); // Очікується: 1
        System.out.println(countAlphaNumeric(text2)); // Очікується: 2
        System.out.println(countAlphaNumeric(text3)); // Очікується: 1
    }

    public static int countAlphaNumeric(String input) {
        if (input == null) {
            throw new NullPointerException("Рядок не може бути null");
        }

        String[] parts = input.split("\\s+");
        int count = 0;

        for (String word : parts) {
            if (word.matches(".*[A-Za-z].*") && word.matches(".*[0-9].*")) {
                count++;
            }
        }

        return count;
    }
}