public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 0;
        int b = 1;
        int sum = a + b;
        System.out.println(a + b);

        if (sum >= 0) {
            System.out.println("sum is positive"); // Кириллица не работает, использовал Английский язык
        }

        else {
            System.out.println("sum is negative");
        }
    }

    public static void printColor() {
        int value = 10;

        if (value <= 0) {
            System.out.println("red");
        } else if (value > 0 && value <= 100) {
            System.out.println("yellow");
        } else {
            System.out.println("green");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");}
        else {
            System.out.println("a < b");
        }
    }
}




