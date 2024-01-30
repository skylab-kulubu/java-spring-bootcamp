public class Basics {

    public static void main(String[] args) {
        /*
         * int myInt = 0;
         * float myFloat = 0.5f;
         * char myLetter = 'A';
         * boolean myBool = false;
         *
         * long id = 9999999999999l;
         *
         * String myString = "Hello";
         *
         * // type casting
         *
         * int id1 = 11111;
         *
         * long id2 = id1;
         *
         * int intId = (int) id;
         *
         * System.out.println(intId);
         *
         * String[] arabalar = {
         * "Fiat",
         * "Opel",
         * "Honda"
         * };
         *
         * int[] ages = {
         * 1, 2, 3, 4, 5, 6
         * };
         *
         * for (int i : arabalar) {
         * System.out.println(i);
         *
         * }
         *
         * System.out.println(arabalar[2]);
         *
         * int a = 10;
         * int b = 8;
         *
         * System.out.println(a + b);
         * System.out.println(a - b);
         * System.out.println(a * b);
         * System.out.println(a / b);
         * System.out.println(a % b);
         *
         *
         */
        int a = 10;

        /*
         * while (a <= 100) {
         * System.out.println(a);
         * a++;
         * }
         */
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        String[] isimler = {
                "OSMAN", "BAHADIR", "ATAKAN"
        };

        for (String isim : isimler) {
            System.out.println(isim);
        }

        for (int i = 0; i < isimler.length; i++) {
            String isim = isimler[i];
            System.out.println(isim);
        }

        int result = 10;
        if (result <= 10) {
            System.out.println("Sonuc ondan kucuk");
        } else {
            System.out.println("Sonuc ondan buyuk");
        }

    }
}
