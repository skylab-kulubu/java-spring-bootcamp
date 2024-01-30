public class HeapStack {
    public static void main(String[] args) {
        int[] numbers1 = { 1, 2, 3, 4, 5 };
        int[] numbers2 = { 10, 20, 30, 40, 50 };

        numbers1 = numbers2;
        numbers2[0] = 1;

        for (int i : numbers2) {
            System.out.println(i);
        }
        for (int i : numbers1) {
            System.out.println(i);
        }

        int number1 = 10;
        int number2 = 1;

        number1 = number2;

        number2 = 20;

        System.out.println(number1);
        System.out.println(number2);
        String a = "BAHADIR";

        String isimlerx = "ASDASJDLKAJSKLDJASLKFJALSKJDLKAJSLKDj";
        String isimlerx1 = "LKASJFLKAJFSKLJASKLFJALKSFJLKAJSFLK";
    }
}
